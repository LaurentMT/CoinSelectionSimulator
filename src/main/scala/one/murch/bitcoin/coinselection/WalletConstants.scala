package one.murch.bitcoin.coinselection

/**
  * Created by murch on 31.12.16.
  */
object WalletConstants {
    val CENT: Long = 1000000
    val COIN: Long = 100 * CENT
    val FEE_PER_KILOBYTE: Long = 10000

    // Assuming Pay-to-Public-Key-Hash
    val BYTES_TRANSACTION_OVERHEAD: Int = 10
    val BYTES_PER_OUTPUT: Int = 34
    val BYTES_PER_INPUT: Int = 148

    /*
    // Assuming Pay-to-Witness-Public-Key-Hash (SegWit)
    val BYTES_TRANSACTION_OVERHEAD: Int = 10
    val BYTES_PER_OUTPUT: Int = 31
    val BYTES_PER_INPUT: Int = 68
*/

    // Dust is when fee is > 1/3 of value
    val DUST_LIMIT: Long = BYTES_PER_INPUT * FEE_PER_KILOBYTE * 3 / 1000
    val OUTPUT_COST: Long = BYTES_PER_OUTPUT * FEE_PER_KILOBYTE / 1000
    val INPUT_COST: Long = BYTES_PER_INPUT * FEE_PER_KILOBYTE / 1000
    val ONE_IN_ONE_OUT_TRANSACTION_SIZE = BYTES_TRANSACTION_OVERHEAD + BYTES_PER_INPUT + BYTES_PER_OUTPUT
    val ONE_IN_ONE_OUT_TX_MIN_FEE = ONE_IN_ONE_OUT_TRANSACTION_SIZE * FEE_PER_KILOBYTE / 1000
    val ONE_IN_TWO_OUT_TRANSACTION_SIZE = BYTES_TRANSACTION_OVERHEAD + BYTES_PER_INPUT + 2 * BYTES_PER_OUTPUT
}