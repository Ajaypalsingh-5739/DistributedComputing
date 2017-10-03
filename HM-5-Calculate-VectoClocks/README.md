<h1>LOGIC INTUITION</h1>
1) The algorithm start from the scheduler which takes input as number of procesors from the user and filename associated to  each Processor.</br>
2) It then forks multiple threads which monitors and reads the file associated to each Processor for events and then calls the Processor which handles the event based on the event type.</br>
3) Rest of the flow and interactions should be explanatory from the sequence diagram and class diagram. </br>

<h1>CLASS DIAGRAM</h1>

![Alt text](Class_Diagram.jpeg?raw=true "Class Diagram")

<h1>SEQUENCE DIAGRAM</h1>

![Alt text](Sequence_Diagram.jpeg?raw=true "Sequence Diagram")

<h1>How to work around with Code</h1>
Create an execution Plan for a Processor in a file and save it.</br> 
Currently there are only two type of events supported.</br>
1) COMPUTATION EVENT: For a computation event just write C (in CAPITAL) for that Processor</br>
2) SEND EVENT: For a send event write S <processer_id_of_receiver> (in CAPITAL). For example in order to simulate a send event to Processor 2, write S 2.</br>

Once you have created execution plans for each processor, run the main.java file from the src folder.</br>
On execution it will ask you to input the number of processors and the name of the files containing their execution plans.</br></br>

Since all the processors are simulated to run individually in their own threads, the execution timeline for each Processor may vary. </br>
The store output will show the vector clocks as they were updated for each processor and it provides intuition of the order in which the execution plan at each processor may occur.</br>

<h1>SAMPLE OUTPUT</h1>

![Alt text](Sample_output.png?raw=true "Sample Output")
