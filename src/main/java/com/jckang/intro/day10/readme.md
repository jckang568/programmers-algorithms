# Day10

### 1. 문자열의 앞의 n글자

#### 문제 설명  
문자열 my_string 과 정수 n 이 매개변수로 주어질 때, my_string 의 앞의 n 글자로 이루어진 문자열을
return 하는 solution 함수를 작성해 주세요.

#### 제한 사항
- my_string 은 숫자와 알파벳으로 이루어져 있습니다.
- 1 ≤ my_string 의 길이 ≤ 1,000
- 1 ≤ n ≤ my_string 의 길이

#### 입출력 예

| my_string        | n    | result        |
|------------------|------|---------------|
| `ProgrammerS123` | `11` | `ProgrammerS` |
| `He110W0rld`     | `5`  | `He110`       |

#### 입출력 예 설명
- 입출력 예 #1  
예제 1번의 my_string 에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.
- 입출력 예 #2  
예제 2번의 my_string 에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.

#### 해설


---

### 2. 접두사인지 확인하기

#### 문제 설명
어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어,
"banana"의 모든 접두사는 `b`, `ba`, `ban`, `bana`, `banan`, `banana`입니다.
문자열 my_string 과 is_prefix 가 주어질 때, is_prefix 가 my_string 의 접두사라면
1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

#### 제한 사항
- 1 ≤ my_string 의 길이 ≤ 100
- 1 ≤ is_prefix 의 길이 ≤ 100
- my_string 과 is_prefix 는 영소문자로만 이루어져 있습니다.

#### 입출력 예

| my_string | is_prefix | result |
|-----------|-----------|--------|
| `banana`  | `ban`     | `1`    |
| `banana`  | `nan`     | `0`    |
| `banana`  | `abcd`    | `0`    |
| `banana`  | `bananan` | `0`    |

#### 입출력 예 설명
- 입출력 예 #1  
예제 1번에서 is_prefix 가 my_string 의 접두사이기 때문에 1을 return 합니다.
- 입출력 예 #2  
예제 2번에서 is_prefix 가 my_string 의 접두사가 아니기 때문에 0을 return 합니다.
- 입출력 예 #3  
예제 3번에서 is_prefix 가 my_string 의 접두사가 아니기 때문에 0을 return 합니다.
- 입출력 예 #4  
예제 4번에서 is_prefix 가 my_string 의 접두사가 아니기 때문에 0을 return 합니다.

---
