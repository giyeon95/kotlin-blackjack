package blackjack.state

import blackjack.Card
import blackjack.PlayerDeck

class Burst(private val playerDeck: PlayerDeck): State {
    init {
        validate(playerDeck.cards)
    }
    override fun currentCard(): PlayerDeck = playerDeck

    override fun isFinish(): Boolean = true

    override fun draw(card: Card): State {
        throw IllegalArgumentException("카드의 합이 21 초과로 패배하셨습니다.")
    }

    private fun validate(cards: List<Card>) {
        println(score(cards))
        require(score(cards) > 21) { "유효하지 않은 카드 입니다" }
    }
}
