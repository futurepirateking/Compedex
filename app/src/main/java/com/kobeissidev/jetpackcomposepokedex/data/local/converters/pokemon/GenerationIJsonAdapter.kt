// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.kobeissidev.jetpackcomposepokedex.data.local.converters.pokemon

import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.GenerationI
import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.RedBlue
import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.Yellow
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.reflect.Constructor
import kotlin.Int

public class GenerationIJsonAdapter(
  moshi: Moshi
) : JsonAdapter<GenerationI>() {
  private val options: JsonReader.Options = JsonReader.Options.of("red-blue", "yellow")

  private val nullableRedBlueAdapter: JsonAdapter<RedBlue?> = moshi.adapter(RedBlue::class.java,
      emptySet(), "redBlue")

  private val nullableYellowAdapter: JsonAdapter<Yellow?> = moshi.adapter(Yellow::class.java,
      emptySet(), "yellow")

  @Volatile
  private var constructorRef: Constructor<GenerationI>? = null

  public override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("GenerationI").append(')') }

  public override fun fromJson(reader: JsonReader): GenerationI {
    var redBlue: RedBlue? = null
    var yellow: Yellow? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          redBlue = nullableRedBlueAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          yellow = nullableYellowAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffffc.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  GenerationI(
          redBlue = redBlue,
          yellow = yellow
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<GenerationI> = this.constructorRef ?:
          GenerationI::class.java.getDeclaredConstructor(RedBlue::class.java, Yellow::class.java,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          redBlue,
          yellow,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: GenerationI?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("red-blue")
    nullableRedBlueAdapter.toJson(writer, value_.redBlue)
    writer.name("yellow")
    nullableYellowAdapter.toJson(writer, value_.yellow)
    writer.endObject()
  }
}
