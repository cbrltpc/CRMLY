@CRMLYEUG-365
Feature: 

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # *{color:#FF0000}User should be able to click on the upload files icon to upload files and pictures from local disks.{color}*
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-359
	Scenario: TC001_verify that user click on the upload files icon to upload files
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click "Upload files" icon
		    Then the user should be able to upload file.	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # {color:#FF0000}*User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.* {color}
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-360
	Scenario: TC002_verify that user to add users contacts from Employees and Departments contact lists.
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click Add more text
		    Then the user should be able to select contact from Employees and Departments lists.	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # *{color:#FF0000}User should be able to attach a link by clicking on the link icon.{color}*
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-361
	Scenario: TC003_verify that user to attach a link by clicking on the link icon.
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click "Link" icon
		    Then User should be able to attach a link by clicking on the link icon.	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # *{color:#FF0000}User should be able to insert videos by clicking on the video icon and entering the video URL.{color}*
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-362
	Scenario: TC004_verify that user to insert videos by clicking on the video icon
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click "Insert video" icon
		    Then User should be able to insert videos by clicking on the video icon	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # {color:#FF0000}User should be able to create a quote by clicking on the Comma icon.{color}
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-363
	Scenario: TC005_verify that user to create a quote by clicking on the Comma icon.
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click "Quote text" icon
		    Then User should be able to create a quote by clicking on the Comma icon.	

	#*User Story:* As a user, I should be able to send announcements from Announcement subheading from "More" under Activity Stream
	#
	# 
	#
	#*Acceptance Criteria:*
	# # User should be able to click on the upload files icon to upload files and pictures from local disks.
	# # User should be able to add users by selecting multiple contacts from Employees and Departments contact lists. 
	# # User should be able to attach a link by clicking on the link icon.
	# # User should be able to insert videos by clicking on the video icon and entering the video URL.
	# # User should be able to create a quote by clicking on the Comma icon.
	# # User should be able to add mention by clicking on the Add mention icon.
	# # User should be able to send an announcement.
	@CRMLYEUG-364
	Scenario: TC006_verify that User to add mention by clicking on the Add mention icon.
		    Given the user logged in
		    When the user navigate to announcement tab under more button
		    And the user click "Add mention" icon
		    When the user click to select contact from Employees and Departments lists.
		    Then User should be able to add mention by clicking on the Add mention icon.