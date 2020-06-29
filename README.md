# Java_TreeLogic

# Coding question:

A gardener owns a garden in which he has planted N number of trees in a row. After few years, the trees have grown in different heights and he wants to make the garden to look aesthetically pleasing (alternately increase and decrease in height or vice-versa). Examples of aesthetically pleasing trees.

|               |
|       |       |   |
|   |   |   |   |   |     [3, 1, 2, 1, 3, 2]

(OR) 
            |
    |       |     |
|   |       |     |
|   |   |   |     |     [2, 3, 1, 4, 3]

# Invalid configurations
      |
   |  |   |
|  |  |   |
|  |  |   |   [2, 3, 4, 3]

           
|            
|   |   |        |
|   |   |   |    |  |   [3, 2, 2, 1, 2, 1] 

# Note:

1. Two adjacent trees cannot have equal heights
2. No of tree changes should be minimum in order to reduce the overall effort of making the garden aesthetically pleasing
