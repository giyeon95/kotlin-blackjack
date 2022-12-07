package blackjack.domain

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.Test

internal class PlayersTest {
    @Test
    internal fun `참가자가 두명이 아니면 예외가 발생한다`() {
        // given
        // when, then
        assertThatIllegalArgumentException().isThrownBy { Players(emptyList()) }
        assertThatIllegalArgumentException().isThrownBy {
            Players(
                listOf(Player("koi", Cards(Card(Number.TWO, Sharp.DIAMOND), Card(Number.THREE, Sharp.HEART))))
            )
        }
    }
}
