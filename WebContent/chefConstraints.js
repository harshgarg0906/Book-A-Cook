function validateLogin()
{
	var username=document.forms["login-form"]["cName"];
	var password=document.forms["login-form"]["cPass"];
	if(username.value=="")
	{
		window.alert("Please enter your name.");
		username.focus();
        return false;
	}
	if(password.value=="")
	{
		window.alert("Please enter your passoword.");
		password.focus();
		return false;
	}
	else
	{
		if(password.value.length>8)
		{
			alert("Password cannot exceed 8 characters");
			return false;
		}
	}
	return true;
	
}
function validateAccSignUp()
{
	var username=document.forms["register-form"]["cName"];
	var password=document.forms["register-form"]["cPass"];
	if(username.value=="")
	{
		window.alert("Please enter your username.");
		username.focus();
        return false;
	}
	if(password.value=="")
	{
		window.alert("Please enter your password.");
		passowrd.focus();
        return false;
	}
	else
	{
		return true;
	}
}
function validateReg()
{
	var username=document.forms["register-form"]["cName"];
	var password=document.forms["register-form"]["cPass"];
	var phone=document.forms["register-form"]["cContact"];
	var pref=document.forms["register-form"]["cType"];
	var sal=document.forms["register-form"]["cSalary"];
	var exp=document.forms["register-form"]["cExp"];
	
	if(username.value=="")
	{
		window.alert("Please enter your username.");
		username.focus();
        return false;
	}
	if(password.value=="")
	{
		window.alert("Please enter your password.");
		passowrd.focus();
        return false;
	}
	if(phone.value=="")
	{
		window.alert("Please enter your phone number.");
		passowrd.focus();
        return false;
	}
	if(pref.value=="")
	{
		window.alert("Please enter your preference.");
		passowrd.focus();
        return false;
	}
	if(sal.value=="")
	{
		window.alert("Please enter your salary.");
		passowrd.focus();
        return false;
	}
	if(exp.value=="")
	{
		window.alert("Please enter the number of years of experience.");
		passowrd.focus();
        return false;
	}
	
	else
	{
		return true;
	}
}