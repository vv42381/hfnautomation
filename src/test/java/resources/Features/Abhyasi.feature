@smoke
Feature: Heartsapp E2E test
#	Scenario Outline: Signin and subcribe
  #Given user open heartsapp
  #When user clicks on signin
  #And user clicks on accept policy
  #And user clicks on Email
  #And user enters email <email>
  #And user enters password <password>
  #And user clicks submit
  #Then text displayed should be <title text>
  #When user clicks on profile image
  #And user clicks on subscription
 #	And user clicks on upgrade
 #	And user clicks on proceed
 #	And user clicks on credit card
 #	And user submits credit card details
 #	And user submits credit card password
 #	Then payment confirmation text displayed should be <confirmation text>
  #Examples:
      #| email 											| password 	| title text 	| confirmation text 		|
      #| abhyasi.2@mailinator.com		| abhyasi 	| Meditate		| Payment Successful!! 	|
      #

#	Scenario Outline: Check all screens
  #Given user open heartsapp
  #When user clicks on signin
  #And user clicks on accept policy
  #And user clicks on Email
  #And user enters email <email>
  #And user enters password <password>
  #And user clicks submit
  #Then text displayed should be <Meditation text>
  #When user swipes <direction> 
  #Then text displayed should be <Introspect text>
  #When user clicks on make note
  #Then text displayed in toolbar should be <Journal text>
  #When user clicks on diary image
  #When user clicks on add button
  #When user enters journal text as date
  #When user saves the entry
  #Then validate journal entry is saved
  #When user clicks back
 #	When user swipes <direction>
 #	Then text displayed should be <Inspire text>
 #	When user clicks on be inspired
 #	Then text displayed in toolbar should be <Inspire text>
 #	When user clicks back
 #	When user swipes <direction>
 #	Then text displayed should be <Discover text>
 #	When user clicks on know more
 #	Then text displayed in toolbar should be <Discover text>
 #	When user clicks back
 #	When user swipes <direction> 	
 #	Then text displayed should be <Explore text>
 #	When user clicks on view more
 #	Then text displayed in toolbar should be <Explore text>
  #Examples:
      #|email 									 | password | Meditation text | Introspect text | direction	| Inspire text | Discover text| Explore text |Journal text |
      #|abhyasi.2@mailinator.com| abhyasi 	| Meditate				| Introspect 			| right 		|Read & Reflect| Explore			| Engage			 |Journal 			|

Scenario Outline: iOS
  Given user open heartsapp
  #When user clicks on profile image
  #When user clicks on signin
  #And user clicks on accept policy
  #And user clicks on Email
  #And user enters email <email>
  #And user enters password <password>
  #And user hides keyboard
  #And user clicks submit
  Then text displayed should be <title text>
	When user swipes <direction> 
  Then text displayed should be <Introspect text>
  When user clicks on make note
  #Then text displayed in toolbar should be <Journal text>
  #When user clicks on diary image
  #When user clicks on add button
  #When user enters journal text as date
  #When user saves the entry
  #Then validate journal entry is saved
  #When user clicks back
  Examples:
      | email 											| password 	| title text 	| Introspect text | direction	|
      | abhyasi.2000@mailinator.com		| abhyasi 	| Meditate		| Introspect 			| right 		|