export class RegisterDataComponent {
    private genders: any;
    private maritalStatus: any;

    constructor() {
        this.updateGender();
        this.updateMaritalStatus();
    }

    private updateGender() {
        this.genders = [{
            'name': '--select--',
            'value': 0
        }, {
            'name': 'Male',
            'value': 1
        }, {
            'name': 'Female',
            'value': 2
        }];
    }

    private updateMaritalStatus() {
        this.maritalStatus = [{
            'name': '--select--',
            'value': 0
        }, {
            'name': 'Single',
            'value': 1
        }, {
            'name': 'Married',
            'value': 2
        }, {
            'name': 'Divorced',
            'value': 3
        }];
    }
}
