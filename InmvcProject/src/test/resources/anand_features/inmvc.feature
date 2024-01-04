Feature: Verifying people module with all possible scenarios


@SmokeTest1
Scenario: CHeck the Forgot password with Valid OTP
Given user is in Login Page
When user Click on Forgot Password button
Then Enter Valid email address
Then Verify OTP Page 
Then Change the Tab to OTP Page 
Then Enter OTP getted Mail
Then Copy the OTP 


@SmokeTest
Scenario: Verifying Schedular Login with Valid Credentials
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then user is navigated to dashboard page


Examples: 
|UserName|Password|
|harish@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Verifying Schedular Login with InValid Password
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then user is have to verify invalid message

Examples: 
|UserName|Password|
|harish@yopmail.com|Inmvc@1234|

@SmokeTest
Scenario: Verifying Schedular Login with InValid UserName
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then user is have to verify invalid message

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Create Meeting With Valid Schedular Account
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then Click on Book Room button
Then Select Available Room
Then Check the Date and time and Click on one Time
Then Enter Meeting Title and Description
And Check Date and Time 
And Select one Video for Meeting
And Add one Participant 
Then Click on Book Room button
Then verify the Booked room Confirmation Message
Then Click on that Created Meeting 
Then Click on Delete button
Then Check the Delete popup and Click on Delete button
Then Check the Meeting is Deleted in List

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Create Meeting With Valid Schedular Account and Delete that Meeting
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then Click on Book Room button
Then Select Available Room
Then Check the Date and time and Click on one Time
Then Enter Meeting Title and Description
And Check Date and Time 
And Select one Video for Meeting
And Add one Participant 
Then Click on Book Room button
Then Click on that Created Meeting 
Then Click on Delete button
Then Check the Delete popup and Click on Delete button
Then Check the Meeting is Deleted in List

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Create Meeting With Calendar and Delete that Meeting
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then Click on Calendar button
Then Select room from dropdown
And Select time for Meeting
Then Enter Meeting Title and Description
And Check Date and Time 
Then Disable the Video Call button
And Add one Participant
Then Click on Book Room button
Then Click on that Created Meeting 
Then Click on Delete button
Then Check the Delete popup and Click on Delete button
Then Check the Meeting is Deleted in List

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Create Meeting With Valid Schedular Account and Update time
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then Click on Book Room button
Then Select Available Room
Then Check the Date and time and Click on one Time
Then Enter Meeting Title and Description
And Check Date and Time 
And Select one Video for Meeting
And Add one Participant 
Then Click on Book Room button
Then Click on that Created Meeting 
Then Click on Edit button 
Then Edit the Meeting name ad Description
Then Click on Update Meeting
Then Click on that Created Meeting 
Then Click on Delete button
Then Check the Delete popup and Click on Delete button
Then Check the Meeting is Deleted in List

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|

@SmokeTest
Scenario: Create Meeting With Valid Schedular Account and Update time
Given user is in Login Page
When user enter <UserName> and <Password>
And click on Login button
Then Click on Book Room button
Then Select Available Room
Then Check the Date and time and Click on one Time
Then Enter Meeting Title and Description
And Edit Date and Time 
And Select one Video for Meeting
And Add one Participant 
Then Click on Book Room button
Then Click on that Created Meeting 
Then Click on Edit button 
Then Edit the Meeting name ad Description
Then Click on Update Meeting
Then Click on that Created Meeting 
Then Click on Delete button
Then Check the Delete popup and Click on Delete button
Then Check the Meeting is Deleted in List

Examples: 
|UserName|Password|
|anand@yopmail.com|Inmvc@123|
