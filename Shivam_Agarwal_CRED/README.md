# CREDAssignment

Problem Statement
Objective:
To develop an abstraction layer for stack framework supporting expand & collapse state of view, Using that abstraction layer you can create one sample stack view implementation shown in below videos.
Here is the dribble shot to get an idea : Dribble Link
Here is the video link of how we at CRED are using it : Video link

Things to make sure:
1. All stack views should have two states(Expanded and collapsed). 
2. Clicking on any collapsed view toggles its state i.e. it expands and the other expanded view ,collapses.
3. Framework can have max 4 states and minimum 2 states.
4. Any assumptions made should be called out explicitly. 

Solution:
Tech Requirement
* Architecture - MVVM with Clean Architecture
* View - Jetpack Compose

Description:
* Created basic UI to show expand & collapse state of views.
* For similar view I am using reusable Composables(Components).

