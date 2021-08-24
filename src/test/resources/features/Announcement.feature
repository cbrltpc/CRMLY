


#User should be able to click on the upload files icon to upload files and pictures from local disks.
#User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
#User should be able to attach a link by clicking on the link icon.
#User should be able to insert videos by clicking on the video icon and entering the video URL.
#User should be able to create a quote by clicking on the Comma icon.
#User should be able to add mention by clicking on the Add mention icon.
#User should be able to send an announcement.






Feature: Users should send announcement

  Scenario: verify that user click on the upload files icon to upload files
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click "Upload files" icon
    Then the user should be able to upload file.

    #   Upload files
    #   Link
    #   Insert video
    #   Quote text
    #   Add mention

  Scenario: verify that user to add users contacts from Employees and Departments contact lists.
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click Add more text
    Then the user should be able to select contact from Employees and Departments lists.

  Scenario: verify that user to attach a link by clicking on the link icon.
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click "Link" icon
    Then User should be able to attach a link by clicking on the link icon.

  Scenario: verify that user to insert videos by clicking on the video icon
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click "Insert video" icon
    Then User should be able to insert videos by clicking on the video icon

  Scenario: verify that user to create a quote by clicking on the Comma icon.
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click "Quote text" icon
    Then User should be able to create a quote by clicking on the Comma icon.

  Scenario: verify that User to add mention by clicking on the Add mention icon.
    Given the user logged in
    When the user navigate to announcement tab under more button
    And the user click "Add mention" icon
    When the user click to select contact from Employees and Departments lists.
    Then User should be able to add mention by clicking on the Add mention icon.

