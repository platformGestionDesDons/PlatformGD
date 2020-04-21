<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjoutEtudiant</title>
</head>
<body>
<form action="InscriptionEtablissement" method="post">
<h1>Veuillez remplir les champs</h1>
NomEtablissement <input type="text" name="input11" /> <br><br>
type de l'etablissement:<select name="input12" >
    <option value="">--Please choose an option--</option>
    <option value="intermediaire">intermediaire</option>
    <option value="ministaire">ministaire</option>
    <option value="drs">drs</option>
    <option value="Hospital">Hospital</option>
 </select> <br><br>
libellee :<select name="input13" >
    <option value="">--Please choose an option--</option>
    <option value="HR">HR</option>
    <option value="HM">HM</option>
 </select> <br><br>
 ${erreur } <br><br>
Email  <input type="text" name="input3" /> <br><br>
Nom  <input type="text" name="input1" /><br> <br>
Prénom  <input type="text" name="input2" /> <br><br>

Password  <input type="password" name="input4" /> <br><br>
role  <input type="text" name="input5" /> <br><br>

tel :  <input type="text" name="input6" /> <br><br>
fax: 	<input type="text" name="input10" /> <br><br>

gouverernort  <input type="text" name="input7" /> <br><br>
adresse  <input type="text" name="input8" /> <br><br>
codePstal  <input type="text" name="input9" /> <br><br>


<input type="submit" value="submit">
</form>
</body>
</html>