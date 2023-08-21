Differences between Java 8 Map() Vs flatMap() :

       map()	                                                            flatMap()
It processes stream of values.	                              It processes stream of stream of values.
It does only mapping.	                                      It performs mapping as well as flattening.
It’s mapper function produces single value for                It’s mapper function produces multiple values for 
each input value.	                                           each input value.
It is a One-To-One mapping.	                                   It is a One-To-Many mapping.
Data Transformation : From Stream to Stream                    Data Transformation : From Stream<Stream to Stream
Use this method when the mapper function is                    Use this method when the mapper function is producing
producing a single value for each input value.	                multiple values for each input value.