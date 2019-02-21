var c=parseLong(document.getElementById("cardno").value);
//var cv=document.getElementById("cvv").value;
//var len=cv.length;
//var a=document.login-form.cardName.value;

function cardname()
{
	alert("chalra");
	
/*if(typeof a=="Number")
	{
	
    alert("Not a valid Name");
    
	}*/
	console.log("welcome");
	if(c<1000000000000000 || c>9999999999999999)
		{
		
	    alert("Not a valid Card Number");
	    
		}

}
function cardnumber()
{
  var cardno = /^(?:5[1-5][0-9]{14})$/;
  if(inputtxt.value.match(cardno))
        {
          if(len ==3)
            return true;
        }
      else
        {
        alert("Not a valid Mastercard number!");
        return false;
        }
}