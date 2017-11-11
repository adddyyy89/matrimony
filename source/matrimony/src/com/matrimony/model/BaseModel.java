package com.matrimony.model;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

import com.matrimony.exceptions.DBException;
import com.matrimony.exceptions.ResultNotFoundException;

public abstract class BaseModel<Entity, DTO> {

	protected Serializable _insert(Session session, Entity entity) throws DBException {
		try {
			return session.save(entity);
		} catch (HibernateException e) {
			throw new DBException(e);
		}
	}

	protected void _update(Session session, Entity entity) throws DBException {
		try {
			Object object = session.merge(entity);
			if (object == null) {
				System.out.println("adhjasjkdhajdsjsakkdjsa");
			}
		} catch (HibernateException e) {
			throw new DBException(e);
		}
	}

	protected void _delete(Session session, Serializable pk) throws ResultNotFoundException, DBException {
		try {
			@SuppressWarnings("unchecked")
			Class<Entity> className = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
					.getActualTypeArguments()[0];
			@SuppressWarnings("unchecked")
			Entity entity = (Entity) session.load(className, pk);
			session.delete(entity);
		} catch (ObjectNotFoundException e) {
			throw new ResultNotFoundException(e);
		} catch (HibernateException e) {
			throw new DBException(e);
		}
	}

	protected Entity _get(Session session, Serializable pk) throws ResultNotFoundException, DBException {
		try {
			@SuppressWarnings("unchecked")
			Class<Entity> className = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
					.getActualTypeArguments()[0];
			@SuppressWarnings("unchecked")
			Entity entity = (Entity) session.get(className, pk);
			if (entity != null) {
				return entity;
			} else {
				throw new ResultNotFoundException("id not found");
			}
		} catch (HibernateException e) {
			throw new DBException(e);
		}
	}

	abstract DTO toDTO(Entity entity);

	abstract Entity toEntity(DTO dto);
}
