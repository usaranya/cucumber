Feature: Validate Adactin site

Scenario: Validate Adactin site

Given user launches Adactin url
When user enter username and password in user text field
Then user click login button

Scenario Outline:

When user select "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<AdultsperRoom>","<ChildrenperRoom>" from dropdown
Then user click search button
Then user click select button on next page
Then click continue button to proceed further
Then user enter "<FirstName>","<LastName>","<Address>","<CreditcardNum>","<CreditcardType>","<Month>","<Year>","<CVVNumber>" in required field
Then user click BookNow button

Examples:
|Location|Hotels|RoomType|NumberofRooms|AdultsperRoom|ChildrenperRoom|FirstName|LastName|Address|CreditcardNum|CreditcardType|Month|Year|CVVNumber|
|London|HotelCreek|Double|1-One|2-Two|1-One|saranya|u|kelambakkam|4561237894561233|MasterCard|May|2021|365|CQ2S3X0MPQ|

