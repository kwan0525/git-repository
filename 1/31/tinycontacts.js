let contacts = new Array();

function displayElementValue(id, text){
    var element = document.getElementById(id);
    element.value = text;
}

function getElementValue(id){
    var element = document.getElementById(id);
    return element.value;
}

function displayContactNotFound()
{
    alert("Not found");
}

function doSave() {
    alert("Saves a contact in the store");

    let name = document.getElementById("name").value;
    let address = document.getElementById("address").value;
    let phone = document.getElementById("phone").value;

    let contact = {
        name: name,
        address: address,
        phone: phone
    }
        contacts.push(contact);
        //alert(contacts[0]);
}

function doFind() {
    let name = getElementValue("name").value;
    let found = false;
    
    for(let i = 0; i < contacts.length; i++) {
        if(name==contacts[i].name)
        {
            found = true;
            displayElementValue("address", contacts[i].address);
            displayElementValue("phone", contacts[i].phone);
        }
    //else{
        //
        //}
    }
    if(!found)
    displayContactNotFound();
}