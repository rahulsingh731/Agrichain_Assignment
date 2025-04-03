# Agrichain_Assignment
This repository contains my solution to the Agrichain Assignment. The assignment consists of two problems: a coding task to find the longest substring without repeating characters and a testing task for automating the website testcases.

## Problem 1: Longest Substring Without Repeating Characters
A Java program to find the length of the longest substring without repeating characters in a given string.

### Examples
- Input: `"abcabcbb"` → Output: `3` (substring: `"abc"`)
- Input: `"bbbbb"` → Output: `1` (substring: `"b"`)
- Input: `"pwwkew"` → Output: `3` (substring: `"wke"`)

### Implementation
- **Language**: Java
- **File**: `src/com/agrichain/tests/Problem1.java`

## Problem 2: Website Testing
Test cases and automation framework for the given website (`https://agrichain.com`) that calculates the longest substring length.

### Test Cases
#### Manual Testing (We can prepare the testcases & test it Manually)
- **Positive Cases**:
  - Input: `"abcabcbb"`, Expected: `3`
  - Input: `"pwwkew"`, Expected: `3`
  - Input: `"a"`, Expected: `1`
- **Boundary Cases**:
  - Empty string `""`, Expected: `0`
  - Long string (1000+ characters)
  - Special characters `"!@#$%"`

#### Automation Testing (We can write the testscripts for it & test it through Automation, for framework below, I took one testcase)
- **Functional Tests**:
  - Verify length for `"abcabcbb"`
  - Empty string handling
  - Single character input
- **Navigation Tests**:
  - Page navigation on submit
  - Back button functionality


### Automation Framework
- **Tool**: Selenium WebDriver with TestNG
- **Language**: Java
- **Structure**:
agrichain-project/
- ├── src/
- │   └── com.agrichain/
- │       ├── LongestSubstring.java  # Problem 1 solution
- │       ├── pages/
- │       │   ├── HomePage.java     # Home page objects
- │       │   └── ResultPage.java   # Result page objects
- │       ├── tests/
- │       │   └── TestSubstring.java # Automated test cases
- │       └── utils/
- │           └── Config.java       # Configuration (optional)
- ├── drivers/
- │   └── chromedriver.exe          # WebDriver executable
- └── pom.xml                       # Maven dependencies



## Setup
1. **Clone**: `git clone https://github.com/rahulsingh731/Agrichain_Assignment.git`
2. **Dependencies**: `mvn clean install` or add Selenium/TestNG JARs
3. **Run Problem 1**: `java -cp src com.agrichain.tests.Problem1`
4. **Run Tests**: `mvn test` or TestNG in Eclipse

## Notes
- Hypothetical locators assumed.

---
Submitted by: Rahul Singh Maures
Date: April 3, 2025
