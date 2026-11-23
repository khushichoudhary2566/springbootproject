//alert("Hello from JavaScript");

var users = [
    {
        "image":"/images/cartoon.png",
        "name": "Mary Doe",
        "gender":"Female"
    },
    {
        "image":"/images/male.jpg",
        "name":"John Doe",
        "gender":"Male"
    }
]

var id=0;

function toggleUser(){
    id=(id+1)%users.length;
    var userImage = document.getElementById("user-image");
    var userName= document.getElementById("user-name");
    var userGender= document.getElementById("user-gender");

    userImage.src = users[id].image;
    userName.innerHTML = users[id].name;
    userGender.innerHTML= users[id].gender;
}