package base;

public enum PageLinksAndText {
    clickSettingCompanyLink("https://ps.contapp.ro/setari/general"),
    contactAppUrlLink("https://contapp.ro/"),
    verifyAssetsRegistryButtonLink("https://ps.contapp.ro/export/3850/assets/pdf/view?year=2023"),
    clickCreateAccountButtonLink("https://account.contapp.ro/register"),
    clickAuthenticationButtonLink("https://account.contapp.ro/login"),
    clickCreateAccountButtonText("The url page  is not the expected one."),
    verifyAlertMessagesText("The alert messages are not the expected ones."),
    emailIncorectText("Email incorect!"),
    authenticationErrorMessage("Datele de autentificare introduse nu se potrivesc cu baza de date"),
    mandatoryEmailMessage("Campul \"E-mail\" este obligatoriu."),

    mandatoryPasswordMessage("Campul \"Parola\" este obligatoriu.");


    private final String value;

    PageLinksAndText(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

