package munit

import com.geirsson.junit.Bootstrapper
import munit.internal.MUnitBootstrapper

import scala.scalajs.reflect.annotation._

@EnableReflectiveInstantiation
trait PlatformSuite { self: Suite =>
  // object $scalajs$junit$bootstrapper extends MUnitBootstrapper(self)
}