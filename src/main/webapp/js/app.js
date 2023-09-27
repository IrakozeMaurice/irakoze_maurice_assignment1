
var model = {

    // school faculties and departments
    getPrograms: function(){
        const programs = {
            'Information Technology':['Information Management','Networks and communication system','Software Engineering'],
            'Business Administration': ['Accounting','Finance','Marketing','Management'],
            'Education': ['English','Mathematics','French','Geography']
        };
        return programs;
    },

}

var controller = {
    // kickoff the application
    initApp: function () {

            const programs = model.getPrograms();
            view.init(programs);
        
    }
}

// This object is responsible for rendering pages and listening to user requests
var view = {

    // Called when user is guest
    init: function (programs) {
            // add faculties to select
            this.addFaculties(programs);

            // add event listener for form input fields validation
            document.getElementById('register_form').addEventListener('input',function (e) {
                e.preventDefault();

                const field = e.target.id;
                if (field === 'faculty') {
                    changeProgramList(programs);
                }else{
                    if (field !== 'department') {
                        let input = document.getElementById(field);
                        if (!validateField(field,input.value) && input.value.length) {
                            input.classList.add('invalid');
                            document.querySelector('.'+field).classList.remove('hidden');
                        }else{
                            input.classList.remove('invalid');
                            document.querySelector('.'+field).classList.add('hidden');
                        }
                    }
                }
            });

            // validate input
            function validateField(field,value) {
                if (field === 'student_id') {
                    if (!isNaN(value)) {
                        return value.length===5;
                    }
                }
                if (field === 'firstname' || field === 'lastname') {
                    if (isNaN(value)) {
                        return strlen(value,2,30);
                    }
                }
                if (field === 'address') {
                    if (isNaN(value)) {
                        return strlen(value,2,30);
                    }
                }
                if(field === 'phone_number'){
                    // 10 digit starting with 078, 079, 073 or 072
                    const regex = /07[2389][0123456789]{7}$/;
                    return matchRegex(regex,value);
                }
                if (field === 'email') {
                    const regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
                    return matchRegex(regex,value);
                }
                if (field === 'password' || field === 'confirm_password') {
                    return strlen(value,6,12);
                }

                // check length of a string
                function strlen(str, min, max){
                    str = str.trim();     
                    return str.length >= min && str.length <= max;
                }
                // check regex match
                function matchRegex(regex,value) {
                    return regex.test(value);
                }
            }

            // change departments according to selected faculty
            function changeProgramList(programs) {
                var facultyList = document.getElementById("faculty");
                var departmentList = document.getElementById("department");
                var selectedFaculty = facultyList.options[facultyList.selectedIndex].value;
                while (departmentList.options.length) {
                    departmentList.remove(0);
                }
                var departments = programs[selectedFaculty];
                if (departments) {
                    var i;
                    for (i = 0; i < departments.length; i++) {
                        var department = new Option(departments[i], departments[i]);
                        departmentList.options.add(department);
                    }
                }
            }
        
    },

    // add faculties to select options
    addFaculties: function(programs){
        var facultyList = document.getElementById("faculty");
        if (facultyList.options.length <= 1) {
            for(let faculty of Object.keys(programs)){
                var fac = new Option(faculty, faculty);
                facultyList.options.add(fac);
            }
        }
      },
}

// START APPLICATION
document.addEventListener('DOMContentLoaded',function () {
    controller.initApp();
});
