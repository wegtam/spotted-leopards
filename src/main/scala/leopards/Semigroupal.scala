/* Example of encoding Functor/Applicative/Monad from cats with Dotty 0.15 features.
 * Derived in part from Cats -- see https://github.com/typelevel/cats/blob/master/COPYING for full license & copyright.
 */
package leopards

trait Semigroupal[F[_]] {
  def (fa: F[A]) product[A, B](fb: F[B]): F[(A, B)]
}
