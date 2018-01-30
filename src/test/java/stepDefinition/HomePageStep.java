package stepDefinition;

import java.awt.AWTException;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStep extends Base {

	@Given("^I Verify the URL of the homepage is \"([^\"]*)\"$")
	public void IVerifytheURLofthehomepageuponnavigatingtothesite(String URL) {

		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@And("^I verify available contents in Header$")
	public void IverifyavailablecontentsinHeader() {

		Base.ele.HeaderContents();
	}

	@And("^I verify available contents in Footer$")
	public void IverifyavailablecontentsinFooter() {

		Base.ele.FooterContents();

	}

	@Then("^I click on how it works link in Header$")
	public void IclickonhowitworkslinkinHeader() {

		Base.Nav.ClickOnTheLink("HowItWorks");

	}

	@And("^I wait for page for to load$")
	public void Iwaitforpagefortoload() {

		Base.ele.WaitForPageToLoad(100);
	}

	@And("^I verify that I redirect to how it works URL which is \"([^\"]*)\"$")
	public void IverifythattheIredirecttothecorrecthowitworksURL(String URL) {

		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@And("^I click on Home page Icon$")
	public void IclickonHomepageIcon() {
		Base.Nav.ClickOnTheLink("Home");
		Base.Nav.VerifyTheCurrentURL("https://clearme.com/home");
	}

	@Then("^I click on where we are link in Header$")
	public void IclickonwherewearelinkinHeader() {

		Base.Nav.ClickOnTheLink("WhereWeAre");
	}

	@And("^I verify that I redirect to where we are URL which is \"([^\"]*)\"$")
	public void IverifythattheIredirecttothecorrectwhereweareURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on For Partners link in Header$")
	public void IclickonForPartnerslinkinHeader() {
		Base.Nav.ClickOnTheLink("ForPartners");

	}

	@And("^I verify that I redirect to For Partners URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectForPartnersURL(String URL) {

		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Platform Overview in For Partners link in Header$")
	public void IclickonPlatformOverviewinForPartnerslinkinHeader() {

		Base.Nav.MoveToTheElement("ForPartners");
		Base.Nav.ClickOnTheLink("PlatformOverview");

	}

	@And("^I verify that I redirect to platform overview URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectPlatformOverviewinForPartnersURL(String URL) {

		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Stadiums and Arenas in For Partners link in Header$")
	public void IclickonStadiumsandArenasinForPartnerslinkinHeader() {
		Base.Nav.MoveToTheElement("ForPartners");
		Base.Nav.ClickOnTheLink("StadiumsAndArenas");

	}

	@And("^I verify that I redirect to stadium and arenas URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectStadiumsandArenasinForPartnersURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Get Clear link in Header$")
	public void IclickonGetClearlinkinHeader() {
		Base.Nav.ClickOnTheLink("GetClearHeader");

	}

	@And("^I verify that I redirect to get clear URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectGetClearURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Log In link in Header$")
	public void IclickonLogInlinkinHeader() {
		Base.Nav.ClickOnTheLink("LogIn");

	}

	@And("^I verify that I redirect to Login URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectLogInURL(String URL) {

		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);

	}

	@Then("^I click on About Us link in Footer$")
	public void IclickonAboutUslinkinFooter() {
		Base.Nav.ClickOnTheLink("AboutUs");

	}

	@And("^I verify that I redirect to about us URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectAboutUsURL(String URL) {

		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Careers At link in Footer$")
	public void IclickonCareersAtlinkinFooter() {
		Base.Nav.ClickOnTheLink("CareersatCLEAR");

	}

	@And("^I verify that I redirect to careers at clear URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectCareersAtURL(String URL) {
		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);

	}

	@Then("^I click on Latest News Clear link in Footer$")
	public void IclickonLatestNewsClearlinkinFooter() {
		Base.Nav.ClickOnTheLink("LatestNews");

	}

	@And("^I verify that I redirect to latest news URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectLatestNewsClearURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Refer a friend link in Footer$")
	public void IclickonReferafriendlinkinFooter() {
		Base.Nav.ClickOnTheLink("ReferaFriend");

	}

	@And("^I verify that I redirect to refer a friend URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectReferafriendURL(String URL) {
		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);

	}

	@Then("^I click on Privacy Policy link in Footer$")
	public void IclickonPrivacyPolicylinkinFooter() {
		Base.Nav.ClickOnTheLink("PrivacyPolicy");
	}

	@And("^I verify that I redirect to privacy policy URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectPrivacyPolicyURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Member Terms link in Footer$")
	public void IclickonMemberTermslinkinFooter() {
		Base.Nav.ClickOnTheLink("MemberTerms");

	}

	@And("^I verify that I redirect to member terms URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectMemberTermsURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);

	}

	@Then("^I click on Terms of Use link in Footer$")
	public void IclickonTermsofUselinkinFooter() {
		Base.Nav.ClickOnTheLink("TermsOfUse");
	}

	@And("^I verify that I redirect to terms of use URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectTermsofUseURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);
	}

	@Then("^I click on LinkedIn link in Footer$")
	public void IclickonLinkedInlinkinFooter() {
		Base.Nav.ClickOnTheLink("LinkedIn");
	}

	@And("^I verify that I redirect to linkedIn URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectLinkedInURL(String URL) {
		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);
	}

	@Then("^I click on Twitter link in Footer$")
	public void IclickonTwitterlinkinFooter() {
		Base.Nav.ClickOnTheLink("Twitter");
	}

	@And("^I verify that I redirect to twitter URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectTwitterURL(String URL) {
		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);
	}

	@Then("^I click on Facebook link in Footer$")
	public void IclickonFacebooklinkinFooter() {
		Base.Nav.ClickOnTheLink("Facebook");
	}

	@And("^I verify that I redirect to facebook URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectFacebookURL(String URL) {
		Base.Nav.VerifyTheCurrentURLOnMultipleWindows(URL);
	}

	@Then("^I click on FAQ link in Footer$")
	public void IclickonFAQlinkinFooter() {
		Base.Nav.ClickOnTheLink("FAQs");
	}

	@And("^I verify that I redirect to FAQ URL which is \"([^\"]*)\"$")
	public void IverifythatIredirecttothecorrectFAQURL(String URL) {
		Base.Nav.VerifyTheCurrentURL(URL);
	}

	@Then("^I click on Email Clear link in Footer$")
	public void IclickonEmailClearlinkinFooter() {
		Base.Nav.ClickOnTheLink("EmailClear");
	}

	@And("^I verify that I can handle Email client$")
	public void IverifythatIcanhandleEmailclient() throws AWTException {
		Base.Nav.HandleEmailClient();
	}

	@Then("^I click on Get Clear link in Footer$")
	public void IclickonGetClearlinkinFooter() {
		Base.Nav.ClickOnTheLink("GetClear");
	}
}
