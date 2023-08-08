package base;

public enum PageLinksAndText {
    clickSettingCompanyLink("https://ps.contapp.ro/setari/general"),
    contactAppUrlLink("https://contapp.ro/"),
    accountLink("https://account.contapp.ro"),
    verifyAssetsRegistryButtonLink("https://ps.contapp.ro/export/3850/assets/pdf/view?year=2023"),
    clickCreateAccountButtonLink("https://account.contapp.ro/register"),
    clickAuthenticationButtonLink("https://account.contapp.ro/login"),
    clickViewCart("https://shop.contapp.ro/cos"),
    clickCreateAccountButtonText("The url page  is not the expected one."),
    verifyAlertMessagesText("The alert messages are not the expected ones."),
    emailIncorectText("Email incorect!"),
    authenticationErrorMessage("Datele de autentificare introduse nu se potrivesc cu baza de date"),
    mandatoryEmailMessage("Campul \"E-mail\" este obligatoriu."),
    mandatoryPasswordMessage("Campul \"Parola\" este obligatoriu."),
    incomePageLink("https://ps.contapp.ro/venituri"),
    salesInvoicesLink("https://ps.contapp.ro/venituri/facturi"),
    eInvoicesLink("https://ps.contapp.ro/setari/integrari"),
    incomeArticlesLink("https://ps.contapp.ro/venituri/articole"),
    clientsLink("https://ps.contapp.ro/venituri/clienti"),
    questionMessage("Ți-am răspuns la întrebare?"),
    representativesLink("https://ps.contapp.ro/setari/representanti"),
    usersLink("https://ps.contapp.ro/setari/utilizatori"),
    preferencesLink("https://ps.contapp.ro/setari/preferinte"),
    integrationsLink("https://ps.contapp.ro/setari/integrari"),
    successMessage("Actualizat cu succes"),
    insertOrActivateTokenMessage("Insereaza sau activeaza token-ul de acces in S.P.V."),
    messageMin("Calculul valorii minime a esuat!"),
    supportSPVLink("https://suport.contapp.ro/article/150-certificat-semnatura-digitala-acces-spv"),
    authorizationInvoiceLink("https://ps.contapp.ro/autorizare-efactura/ff3f9b76-99c8-406f-a765-5a52221d2c97"),
    messageCart("Produsele din cos au fost sterse!"),
    messageThanksCart("Mulțumim pentru comandă!"),
    textmessage("Mulțumim pentru părere");
    private final String value;
    PageLinksAndText(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}

