# kotlin-blackjack

🚀 2단계 - 블랙잭

- Card
    - Sharp와 Number 으로 구성되어 있다.

- Deck
    - Deck 에서는 카드를 한장 뽑아서 줄 수 있다.
    - 카드를 뽑으면 Deck 에서 카드가 한장 감소한다.

- Player
    - Player은 이름과 카드 목록을 가지고 있다.
    - 승리자 플레이어
    - 카드 점수의 합이 21이상이면 게임에서 패한다.

- Sharp는 HEART, SPADE, DIAMOND, CLOVER 으로 구성된다.
- Number 은 ACE TWO, ... JACK, KING, QUEEN 으로 구성된다.
- Number 각 의미에 맞는 값을 가지고 있다.


🚀 3단계 - 블랙잭(딜러)

Dealer
- Dealer는 `처음에 받은 2장의 합계`가 16 이하면 반드시 1장의 카드를 추가로 받아야 하며, 합계가 17점 이상이면 추가로 카드를 받을 수 없다.
- 딜러가 21을 초과하면 그 시점까지 남아있던 플레이어들은 가지고 있는 패에 상관없이 승리한다.

BlackJackResult
- 승자 플레이어와, 패자 플레이어를 가지고 있다.

프로그래밍 요구사항
- 딜러와 플레이어에서 발생하는 중복 코드를 제거해야 한다.
- 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
