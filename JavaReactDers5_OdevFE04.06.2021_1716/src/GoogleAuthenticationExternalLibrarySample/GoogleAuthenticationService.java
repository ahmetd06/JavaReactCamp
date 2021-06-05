package GoogleAuthenticationExternalLibrarySample;

public class GoogleAuthenticationService {

	public GoogleAuthenticationResult AuthGoogleUser() {

		// google nin bize g�sterece�i ve google ye ait mini sayfadan kullan�c� mail ve
		// �ifresini girdi ve googleun kendi
		// sisteminde girilen bu mail ve parola sonucu do�rulama oldu ise bize ad soyad
		// ve kullan�c� ad�n� g�nderdi�ini
		// sim�le ettik. /////////ki�i bilgileri geldi.

		GoogleAuthenticationResult result = new GoogleAuthenticationResult();
		result.setAuthenticated(true);
		result.setUserId("Google den gelen kullan�ya googlenin verdi�i id");
		result.setFirstName("Googledan gelen Ad");
		result.setLastName("Googledan gelen soyad");
		result.seteMail("Googleden gelen mail");
		return result;
	}

}
