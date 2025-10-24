# java-racingcar-precourse

## 📌 기능 구현 목록

### 👩‍💻프로그램 ```Application```
- 입력, 게임 진행, 출력 3가지 과정을 연결한다.
- 위 과정에서 발생한 에러를 처리한다.
- ```RacingCarInputChecker```로부터 ```IllegalArgumentException```을 받을 경우 오류 메시지 출력 후 애플리케이션을 종료한다.

### ⌨️입력 ```RacingCarInput```
- 사용자로부터 문자열을 입력받는다.
- 사용자로부터 게임을 시도할 횟수를 입력받는다.

### 🔎 입력 유효성 검증 ```RacingCarInputChecker```
- 입력된 문자열에서 쉼표를 이용해 이름을 구분한다.
- 이름의 경우 5자 이하만 가능하며 그렇지 않을 경우 ```IllegalArgumentException```을 발생시킨다.
- 게임을 시도할 횟수를 검증한다. 이때 1 이상의 정수가 아닐 경우 ```IllegalArgumentException```을 발생시킨다.

### 🚗 자동차  ```Car```
- String name과 int position을 상태로 가진다.
- move() : 0~9 사이 값을 받아 4 이상이면 position을 1만큼 증가시킨다.

### 💡 게임 진행 ```RacingCarGame```
#### 🏃전진
- 자동차 목록을 상태로 가져 라운드를 진행한다.
- ```camp.nextstep.edu.missionutils.Randoms```의 ```pickNumberInRange()```를 활용하여 0~9 사이의 Random 값을 구한다.
- 구한 값을 이용하여 Car 객체의 move(value)를 호출한다.
- 게임 종료 후 postion이 가장 높은 Car 객체들을 리스트로 반환한다.

### 🖥️출력 ```RacingCarOutput```
#### 📜 차수별 결과 출력
- 게임에 참여하는 모든 자동차에 대해서 차수별 실행 결과를 출력한다.

#### 🏆 최종 우승자 출력
- 게임의 최종 우승자를 출력한다. 여러 명일 경우 쉼표(,)를 이용해 나열한다.