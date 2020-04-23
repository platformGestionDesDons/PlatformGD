<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="__header.jsp"%>
<%@ include file="menu.jsp"%>
<section class="page-section light-bg">
	<div class="image-bg content-in fixed"
		data-background="/assets/img/sections/slider/Projects.jpg"></div>
	<div class="overlay"></div>

	<div class="container">
		<div class="row">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 form-box-cha9a9a">
						<h3 class="title">Inscrire mon établissement</h3>
						<hr>
						<form name="registration_association_form" method="post"
							action="InscriptionEtablissement"
							class="pad-20 fos_user_registration_register" role="form">

							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_association_name">Nom
											de l&#039;établissement</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_association_form_association_name"
											name="input11" required="required"
											placeholder="Tapez le nom de l&#039;établissement"
											class="form-control" />
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_association_name">Type
											de l&#039;établissement</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <select
											id="new_fund_type" name="input12" class="form-control">
											<option value=" "><div
													class="cha9a9a-title text-center pad-5">
													<h5>--Veuillez choisir une option--</h5>
											</option>
											<option value="intermediaire">intermediaire</option>
											<option value="ministaire">ministaire</option>
											<option value="drs">drs</option>
											<option value="Hospital">Hospital</option>
										</select>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_association_name">Libelle</label>

										</i><span class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <select
											id="new_fund_type" name="input13" class="form-control">
											<option value=" "><div
													class="cha9a9a-title text-center pad-5">
													<h5>--Veuillez choisir une option--</h5>
											</option>
											<option value="HR">Hôpital régional</option>
											<option value="HM">Défense et intérieur</option>
										</select>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_form_firstname">Gouvernorat</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_form_firstname" name="input7"
											required="required"
											placeholder=" Choisissez votre guvernorat"
											class="form-control" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_form_lastname">Adresse</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_form_lastname" name="input8"
											required="required" placeholder="Tapez votre adresse"
											class="form-control" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_form_lastname">Code postal</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="number"
											id="registration_form_lastname" name="input9"
											required="required" placeholder="Tapez votre code postal"
											class="form-control" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_firstname">Prénom
											de responsable</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_association_form_firstname" name="input2"
											required="required" placeholder="Tapez votre prénom"
											class="form-control" />
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_lastname">Nom de
											responsable</label> </i><span class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_association_form_lastname" name="input1"
											required="required" placeholder="Tapez votre nom"
											class="form-control" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_email">Numéro de
											Télèphone</label> </i><span class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="tel"
											id="registration_association_form_email" name="input6"
											required="required"
											placeholder="Tapez votre numero de télèphone"
											class="form-control" />
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_email">Fax</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="tel"
											id="registration_association_form_email" name="input10"
											required="required" placeholder="Tapez votre numero de fax"
											class="form-control" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_association_name">Rôle</label>

										</i><span class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="text"
											id="registration_association_form_association_name"
											name="input5" required="required"
											placeholder="Choisissez le rôle" class="form-control" />
									</div>
								</div>

								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_email">Adresse
											e-mail de responsable</label> </i><span
											class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="email"
											id="registration_association_form_email" name="input3"
											required="required" placeholder="Tapez votre adresse email"
											class="form-control" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label class="control-label required"
											for="registration_association_form_plainPassword_first">Mot
											de passe</label> </i><span class="required text-danger form-asterisk"
											title="Ce champ est requis">*</span> <input type="password"
											id="registration_association_form_plainPassword_first"
											name="input4" required="required"
											placeholder="Choisissez un mot de passe" class="form-control" />
									</div>
								</div>

							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<div class="checkbox">
											<label class="required"><input type="checkbox"
												id="registration_association_form_cgu_accepted"
												name="registration_association_form[cgu_accepted]"
												required="required" class="form-group-lg" value="1" />
												J'accepte <a href="../../cgu/iframe.html" class="iframe"
												style="text-decoration: underline;" id="cgu-content">les
													conditions générales d'utilisation</a></label>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-6 text-right"></div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<div class="g-recaptcha"
										data-sitekey="6Lcu-YIUAAAAACuHkoALk0xEiwvKng3khyAr-PBm"></div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<input type="submit"
										class="btn btn-default register pull-right"
										value="Valider l&#039;inscription" />
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<br>
									<p>
										En créant un compte, vous confirmez que vous acceptez <a
											href="../../cgu/iframe.html" class="iframe"
											style="text-decoration: underline;" id="cgu-content">les
											conditions d'utilisation</a>, <a href="../../privacy/iframe.html"
											class="iframe" style="text-decoration: underline;"
											id="cgu-content">la politique de confidentialité</a> et
										l'utilisation des cookies de platform.
									</p>
								</div>
							</div>
							<div class="clearfix"></div>

							<input type="hidden" id="registration_association_form__token"
								name="registration_association_form[_token]"
								value="2sgpUWUPlUZB6br8bJygmYe7UVpD9LEvKdd0jeglrIQ" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<%@ include file="__footer.jsp"%>

<!-- <head>
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
</html> -->