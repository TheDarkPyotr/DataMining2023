# Gun Incidents in the USA 
## Data Mining - A.Y. 2023/2024

This README provides an overview of the Gun Incidents in the USA project for the academic year 2023/2024, including dataset details and the tasks to be completed. For more detailed information, please refer to the project documentation and code (*still in progress*).

The project involves data analysis using data mining tools and must be completed by a team of three students. The primary programming language for this project is Python. The project guidelines specify addressing specific tasks, and the results must be reported in a unique paper with a total length of 25 pages of text, including figures. Additionally, students are required to deliver both the paper and well-commented Python notebooks.

## Dataset Description

The project utilizes three CSV files. The main dataset, `incidents.csv`, contains information about gun incidents in the USA. It includes the following variables:

1. `date`: Date of incident occurrence
2. `state`: State where the incident took place
3. `city_or_county`: City or county where the incident took place
4. `address`: Address where the incident took place
5. `latitude`: Latitude of the incident
6. `longitude`: Longitude of the incident
7. `congressional_district`: Congressional district where the incident took place
8. `state_house_district`: State house district
9. `state_senate_district`: State senate district where the incident took place
10. `participant_age1`: Exact age of one (randomly chosen) participant in the incident
11. `participant_age_group1`: Exact age group of one (randomly chosen) participant in the incident
12. `participant_gender1`: Exact gender of one (randomly chosen) participant in the incident
13. `min_age_participants`: Minimum age of the participants in the incident
14. `avg_age_participants`: Average age of the participants in the incident
15. `max_age_participants`: Maximum age of the participants in the incident
16. `n_participants_child`: Number of child participants (0-11)
17. `n_participants_teen`: Number of teen participants (12-17)
18. `n_participants_adult`: Number of adult participants (18+)
19. `n_males`: Number of male participants
20. `n_females`: Number of female participants
21. `n_killed`: Number of people killed
22. `n_injured`: Number of people injured
23. `n_arrested`: Number of arrested participants
24. `n_unharmed`: Number of unharmed participants
25. `n_participants`: Number of participants in the incident
26. `notes`: Additional notes about the incident
27. `incident_characteristics1`: Incident characteristics
28. `incident_characteristics2`: Incident characteristics (not all incidents have two available characteristics)

The second file, `povertyByStateYear.csv`, contains information about the poverty percentage for each USA state and year, with the following variables:

1. `state`
2. `year`
3. `povertyPercentage`: Poverty percentage for the corresponding state and year

The third file, `year_state_district_house.csv`, contains information about the winner of the congressional elections in the USA for each year, state, and congressional district. It includes the following variables:

1. `year`
2. `state`
3. `congressional_district`
4. `party`: Winning party for the corresponding congressional district in the state, in the corresponding year
5. `candidateVotes`: Number of votes obtained by the winning party in the corresponding election
6. `totalVotes`: Total number of votes for the corresponding election

## Tasks

### Task 1: Data Understanding and Preparation (30 points)

#### Task 1.1: Data Understanding

Explore the incidents dataset using analytical tools and write a concise "data understanding" report that assesses data quality, the distribution of variables, and pairwise correlations.

#### Task 1.2: Data Preparation

Improve the quality of your data and prepare it by extracting new features interesting for describing the incidents. Some examples of indicators to be computed are:

- How many males are involved in incidents relative to the total number of males for the same city and in the same period?
- How many injured and killed people have been involved relative to the total injured and killed people in the same congressional district in a given period of time?
- Ratio of the number of killed people in the incidents relative to the number of participants in the incident
- Ratio of unharmed people in the incidents relative to the average of unharmed people in the same period

Note that these examples are not mandatory, and teams can define their own indicators. Each indicator must be correlated with a description and, when necessary, its mathematical formulation. The extracted variables will be useful for the clustering analysis in the second project's task. Once the set of indicators is computed, the team should explore the new features for a statistical analysis, including distributions, outliers, visualizations, and correlations.

Subtasks of Data Understanding:

- Data semantics for each feature not described above and the new ones defined by the team
- Distribution of the variables and statistics
- Assessing data quality (missing values, outliers, duplicated records, errors)
- Variables transformations
- Pairwise correlations and eventual elimination of redundant variables

Nice visualization and insights can be obtained by exploiting the latitude and longitude features ([example](https://plotly.com/python/getting-started/)).

### Task 2: Clustering Analysis (30 POINTS - 32 with optional subtask)

Based on the features extracted in the previous task, explore the dataset using various clustering techniques. Carefully describe your decisions for each algorithm and the advantages provided by the different approaches.

Subtasks:

- Clustering Analysis by K-means on the entire dataset:
  1. Identification of the best value of k
  2. Characterization of the obtained clusters using analysis of the k centroids and comparison of the distribution of variables within the clusters and that in the whole dataset
  3. Evaluation of the clustering results

- Analysis by density-based clustering. In this task, choose one state in the dataset:
  1. Study the clustering parameters
  2. Characterize and interpret the obtained clusters

- Analysis by hierarchical clustering. In this task, choose one state in the dataset:
  1. Compare different clustering results obtained using different versions of the algorithm
  2. Show and discuss different dendrograms using different algorithms

- Final evaluation of the best clustering approach and comparison of the clustering obtained

- Optional (2 points): Explore the opportunity to use alternative clustering techniques in the library [pyclustering](https://github.com/annoviko/pyclustering/)

Note: The final report must be delivered by the end of December and can also improve the already delivered tasks.

---

