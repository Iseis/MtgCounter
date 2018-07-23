package com.firerocks.mtgcounter.counter

interface CounterMVP {
    interface Presenter {
        fun setView(counterView: CounterMVP.View)

        fun addPlayer(onResult: (Player) -> Unit)

        fun removePlayer()

        fun resetPlayerHealth(onResult: (Int) -> Int)

        fun updatePlayerHealth(player: Int, update: String, onResult: (Int) -> Int)

        fun updatePlayerName(player: Int, name: String, onResult: (String) -> Unit)
    }

    interface View {
        fun changePlayerName(name: String)
    }
}