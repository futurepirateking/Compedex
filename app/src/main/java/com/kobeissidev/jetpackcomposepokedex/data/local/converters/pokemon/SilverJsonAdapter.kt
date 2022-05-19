// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.kobeissidev.jetpackcomposepokedex.data.local.converters.pokemon

import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.Silver
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.String

public class SilverJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Silver>() {
  private val options: JsonReader.Options = JsonReader.Options.of("back_default", "back_gray",
      "front_default", "front_gray")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "backDefault")

  @Volatile
  private var constructorRef: Constructor<Silver>? = null

  public override fun toString(): String = buildString(28) {
      append("GeneratedJsonAdapter(").append("Silver").append(')') }

  public override fun fromJson(reader: JsonReader): Silver {
    var backDefault: String? = null
    var backGray: String? = null
    var frontDefault: String? = null
    var frontGray: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          backDefault = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          backGray = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          frontDefault = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          frontGray = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffff0.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Silver(
          backDefault = backDefault,
          backGray = backGray,
          frontDefault = frontDefault,
          frontGray = frontGray
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Silver> = this.constructorRef ?:
          Silver::class.java.getDeclaredConstructor(String::class.java, String::class.java,
          String::class.java, String::class.java, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          backDefault,
          backGray,
          frontDefault,
          frontGray,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Silver?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("back_default")
    nullableStringAdapter.toJson(writer, value_.backDefault)
    writer.name("back_gray")
    nullableStringAdapter.toJson(writer, value_.backGray)
    writer.name("front_default")
    nullableStringAdapter.toJson(writer, value_.frontDefault)
    writer.name("front_gray")
    nullableStringAdapter.toJson(writer, value_.frontGray)
    writer.endObject()
  }
}
