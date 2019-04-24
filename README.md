# Assignment – Swachh Bharat

You have to design and implement an application for Swachh Bharat scheme. This is an extremely fun and innovative requirement, hence you have complete freedom to let your imagination go wild and showcase your technical skills while adhering to the broad requirements laid out below.

Also note that though you obviously can take the easy route and search online for a solution, this assignment is really about displaying your own analytical and technical skills, so the more individuality you show, the better shall be your prospects.

Also please note that it is not how much you cover but how you approach the solution which we are really interested in, hence make sure you commit code regularly as we would be closely monitoring the progress on a daily basis.

Use this opportunity to show us what you have got and that you have what it takes to join us as we build a wonderful product together.

# Functional Requirements

Below are listed the functional requirements that the solution should support. Wherever in doubt, make reasonable assumptions and move forward but please do document those assumptions as well so that we know why you made them.

Imagine a pleasant day at a beach enjoying the sunset and then you see a pile of garbage floating in the ocean. Wouldnt this be a complete turn-off to your pleasent mood? We know that tonnes of garbage are being dumped into the ocean every year which could have been avoided if there was a proper way to dispose them.

Now the solution we want to offer is to recycle these, used plastic and other types of waste, and thereby not only contributing to a clean and healthy ecology but also to save valuable marine life.

Imagine that the Govt of India, as part of Swachh Bharat scheme, has setup recycling kiosks at various places to collect waste. These kiosks would run an application to guide the user to deposit waste into it in return for a token of appreciation in the form of coupon points.

Your task is to create a prototype of this software application meeting the following requirements

- Users can register themselves
- Submit information w.r.t various kinds of wastage like cans, glass bottles etc.,
- Receive coupon points calculated based on amount of waste deposited.
- Claim the points instantly
- More than one user can use the application at the same time
- The application accepts three types of wastage, Plastic, Metal and Glass
- The application should allow to accept multiple types of wastage in a single session
- Upon providing the quantity, type and brand of the wastage and submitting for recycle, A detailed report containing count, type, individual weight per type and total weight of the wastage submitted has to be generated along with that display a message with unique coupon code and the number of coupon points earned.
- Ability to store the statistics report generated (Quantity, Weight, Consumer details, Points etc.) to a file on disk (XML or JSON format)

Some of the important data attributes involved are

- Details of the user to whom the coupon points are to be rewarded. (name, phone, email)
- Type (e.g. plastic) and Brand (e.g. Pepsi) of wastage returned by a particular user
- Weight and total count per type and brand submitted for recycling
- Total number of points the user has earned
- After providing the type of wastage, their specific brand have to be provided as inputs (so there is a many to many relationship between type and brand)
- Each type and brand combination should be assigned a specific weight and coupon points

Consider the below example for better understanding

   A **plastic coke** bottle may weigh 30gm and have 20 coupon points, whereas a **plastic sprite** bottle may weigh around 20gm and have 15 coupon points

Similarly a **glass coke** may weigh 60 gm and 30 coupon points where as **plastic coke** bottle may weigh 30gm and have 20 coupon points

Assume multiple types and brands, Assign the weights and points accordingly and calculate the required details.

The final solution should allow us to run a simulation of an application where we would provide the following data

- Capture the details of the user returning the wastage (Name, Contact Details, Email address).
- Capture the category of wastage (Plastic, Metal, Glass)
- Mark the brand of the wastage if known else default to others
- Upon submitting for recycle, a statistics report and a random coupon code has to be generated and the coupon points earned has to be returned to the user

# Technical requirements

- Java is the programming language to be used to develop the solution with command line interface to interact and provide inputs.
  no facny ui is required here (i.e use of swing or html).
- Maven should be used as the build system for compiling and producing the final binary
- The solution should produce a JAR file which we can run from the command line by passing necessary arguments
- Classpath dependencies that we would need to meet in order to be able to run the solution
- Wherever possible, decouple data from the system. e.g. the category, brand / type could be read from a file rather than hard coding within the solution

## **Step 1**

Include a **Mandatory** README file describing your solution In Maximum 400 words. You can have as many documentation files as you want. Use Markdown for the documentation,

## **Step 2**

Fork this repository, and create a subdirectory titled with your name and any other optional text describing your solution

## **Step 3**

Complete coding for your solution

## **Step 4**

Submit a pull request to this repository before the stipulated due date for the assignment. Everything related to your solution should be within the subdirectory you created above

# Important

You would need to mandatorily submit a pull request, without which we cannot consider your assignment for evaluation. Also ensure that you submit only one pull request and that too only after you are fully ready to share your assignment with us.

We really look forward to getting some bright minds who can show us all their creativity and aptitude through this assignment.

# Reference Material

Given below are links to some reference material which you may find useful while doing the assignment.

1. Github - Forking and submitting pull requests

- [https://gun.io/blog/how-to-github-fork-branch-and-pull-request/](https://gun.io/blog/how-to-github-fork-branch-and-pull-request/)

1. Using Tortoise GIT

- [https://tortoisegit.org/docs/tortoisegit/](https://tortoisegit.org/docs/tortoisegit/)

1. GIT basics

- [https://www.atlassian.com/git/tutorials](https://www.atlassian.com/git/tutorials)

1. Maven tutorial and how to use with Eclipse

- [https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [http://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/](http://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/)

## **All the best and happy coding :-)**
