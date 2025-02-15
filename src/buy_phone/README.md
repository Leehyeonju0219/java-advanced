# 휴대폰 구매 및 켜기 시뮬레이션

이 프로젝트는 객체 지향 프로그래밍을 사용하여 사용자가 휴대폰을 구매하고 켜는 과정을 시뮬레이션하는 간단한 Java 프로그램입니다. 사람과 휴대폰 객체를 사용하여 프로그램을 구성하였습니다.

## 클래스 설명

### Phone (추상 클래스)
- `user` : 휴대폰 사용자의 이름
- `brand` : 휴대폰 브랜드 이름

메서드:
- `buyPhone()` : 사용자가 휴대폰을 구매했음을 출력
- `turnOn()` : 사용자가 휴대폰을 켰음을 출력하고, `loading()` 메서드를 호출
- `loading()` : 추상 메서드로, 각 휴대폰 브랜드별로 다른 출력을 가짐

### iPhone (Phone 상속)
- `loading()` : "@@@ 폰 켜지는 중 @@@" 출력

### Galaxy (Phone 상속)
- `loading()` : "*** 폰 켜지는 중 ***" 출력

### Person
- `name` : 사람의 이름
- `phone` : 사람이 소유한 휴대폰 객체

메서드:
- `buyPhone(Phone phone)` : 사람이 휴대폰을 구매했음을 설정하고 출력
- `turnOnPhone()` : 사람이 소유한 휴대폰을 켬

### Main
- 메인 메서드에서는 두 명의 사람 객체와 각각의 휴대폰 객체를 생성하고, 휴대폰을 구매하고 켜는 과정을 시뮬레이션

## 파일 구조
```
.
├── src
│ └── buy_phone
│ ├── Galaxy.java
│ ├── iPhone.java
│ ├── Main.java
│ ├── Person.java
│ └── Phone.java
└── README.md
```

## 사용 방법

1. 이 저장소를 클론합니다.
   ```sh
   git clone [저장소 URL]
   ```
2. 클론한 디렉토리로 이동합니다.
   ```sh
   cd [저장소 디렉토리]
   ```
3. Java 파일들을 컴파일합니다.
   ```sh
   javac -d . src/buy_phone/Phone.java src/buy_phone/iPhone.java src/buy_phone/Galaxy.java src/buy_phone/Person.java src/buy_phone/Main.java
   ```
4. 프로그램을 실행합니다.
   ```sh
   java buy_phone.Main
   ```

## 실행 결과

```
잡스님이 애플폰을 구매했습니다.
잡스님이 애플폰을 켰습니다.
@@@ 폰 켜지는 중 @@@

재용님이 삼송폰을 구매했습니다.
재용님이 삼송폰을 켰습니다.
*** 폰 켜지는 중 ***
```
