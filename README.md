# 🚆 TrainApp

TrainApp is a Java-based project that demonstrates the implementation of Java Collections, Streams, Exception Handling, Searching, Sorting, and Regular Expressions through real-world train consist management scenarios.

## 📌 Project Description

This project simulates different train management operations using Java concepts such as:

- Collections Framework
- Streams API
- Comparator
- Exception Handling
- Custom Exceptions
- Regular Expressions
- Searching Algorithms
- Sorting Algorithms

Each use case focuses on a specific Java concept while solving a train management problem.

---

## 🚀 Technologies Used

- Java
- Eclipse IDE
- Java Collections Framework
- Java Streams API
- Regular Expressions
- Exception Handling
- Git
- GitHub

---

## 📂 Project Structure

```
TrainApp
│
├── UC1  - Initialize Train Consist
├── UC2  - Add Passenger Bogies
├── UC3  - Track Unique Bogie IDs
├── UC4  - Maintain Ordered Bogie Consist
├── UC5  - Preserve Insertion Order
├── UC6  - Map Bogie Capacity
├── UC7  - Sort Bogies using Comparator
├── UC8  - Filter Bogies using Streams
├── UC9  - Group Bogies using Streams
├── UC10 - Calculate Total Seating Capacity
├── UC11 - Validate Train ID and Cargo Code
├── UC12 - Safety Compliance Check
├── UC13 - Performance Comparison (Loops vs Streams)
├── UC14 - Custom Exception Handling
├── UC15 - Runtime Exception Handling
├── UC16 - Bubble Sort
├── UC17 - (Reserved)
├── UC18 - Linear Search
├── UC19 - Binary Search
└── UC20 - Exception Handling During Search
```

---

# 📖 Use Cases

## UC1
Initialize an empty train consist using an ArrayList.

---

## UC2
Manage passenger bogies by:

- Adding bogies
- Removing bogies
- Searching for a bogie

Collection Used:
- ArrayList

---

## UC3
Store unique bogie IDs.

Collection Used:
- HashSet

---

## UC4
Maintain train formation while preserving insertion order.

Collection Used:
- LinkedList

---

## UC5
Maintain insertion order and remove duplicate bogies.

Collection Used:
- LinkedHashSet

---

## UC6
Map bogie names with seating capacities.

Collection Used:
- HashMap

---

## UC7
Sort bogies according to seating capacity.

Concept Used:
- Comparator

---

## UC8
Filter passenger bogies with seating capacity greater than 60.

Concept Used:
- Java Streams

---

## UC9
Group bogies according to their type.

Concept Used:
- Collectors.groupingBy()

---

## UC10
Calculate total seating capacity of the train.

Concept Used:
- Stream reduce()

---

## UC11
Validate:

- Train ID
- Cargo Code

Concept Used:
- Regular Expressions

Example Formats:

```
TRN-1234
PET-AB
```

---

## UC12
Validate safety rules for goods bogies.

Business Rule:

- Cylindrical bogies should carry Petroleum only.

---

## UC13
Compare execution time between:

- Traditional Loops
- Java Streams

---

## UC14
Handle invalid bogie capacity using a Custom Exception.

Exception:

```
InvalidCapacityException
```

---

## UC15
Handle unsafe cargo assignment using a Runtime Exception.

Exception:

```
CargoSafetyException
```

---

## UC16
Sort passenger capacities using Bubble Sort.

---

## UC17
Reserved for future enhancements.

---

## UC18
Search a bogie using Linear Search.

---

## UC19
Search a bogie using Binary Search.

---

## UC20
Handle exceptions when searching in an empty train consist.

Exception:

```
IllegalStateException
```

---

# ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/vaddinandini2226/TrainApp.git
```

2. Open the project in Eclipse.

3. Run any use case as:

```
Run As → Java Application
```

---

# 📚 Java Concepts Covered

- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- HashMap
- Comparator
- Streams API
- Filter
- Reduce
- GroupingBy
- Regular Expressions
- Bubble Sort
- Linear Search
- Binary Search
- Custom Exceptions
- Runtime Exceptions
- Exception Handling

---

# 🎯 Learning Outcomes

After completing this project, you will understand:

- Java Collections Framework
- Searching and Sorting algorithms
- Functional Programming using Streams
- Exception Handling
- Custom Exception creation
- Regular Expression validation
- Performance comparison techniques
- Real-world Java application development

---

# 👩‍💻 Author

**Vaddi Nandini**

GitHub: https://github.com/vaddinandini2226

---

⭐ If you found this project useful, consider giving it a **Star** on GitHub.
