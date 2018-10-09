Feature: Quiero buscar un video
  Lo busco en youtube
  Lo comparto en una red social

  Scenario: Looking for a video of Redimi2
    Given the user is on youtube home page
    When the user looks for video of and share it 'Redimi2'
    When the user changes the tab to share the video
    When the user logs on facebook and post the video 
    
    
