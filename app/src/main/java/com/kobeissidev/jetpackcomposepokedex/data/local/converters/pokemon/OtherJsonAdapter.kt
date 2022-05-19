// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.kobeissidev.jetpackcomposepokedex.data.local.converters.pokemon

import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.DreamWorld
import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.OfficialArtwork
import com.kobeissidev.jetpackcomposepokedex.data.model.pokemon.Other
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.reflect.Constructor
import kotlin.Int

public class OtherJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Other>() {
  private val options: JsonReader.Options = JsonReader.Options.of("dream_world", "official-artwork")

  private val nullableDreamWorldAdapter: JsonAdapter<DreamWorld?> =
      moshi.adapter(DreamWorld::class.java, emptySet(), "dreamWorld")

  private val nullableOfficialArtworkAdapter: JsonAdapter<OfficialArtwork?> =
      moshi.adapter(OfficialArtwork::class.java, emptySet(), "officialArtwork")

  @Volatile
  private var constructorRef: Constructor<Other>? = null

  public override fun toString(): String = buildString(27) {
      append("GeneratedJsonAdapter(").append("Other").append(')') }

  public override fun fromJson(reader: JsonReader): Other {
    var dreamWorld: DreamWorld? = null
    var officialArtwork: OfficialArtwork? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          dreamWorld = nullableDreamWorldAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          officialArtwork = nullableOfficialArtworkAdapter.fromJson(reader)
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
      return  Other(
          dreamWorld = dreamWorld,
          officialArtwork = officialArtwork
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Other> = this.constructorRef ?:
          Other::class.java.getDeclaredConstructor(DreamWorld::class.java,
          OfficialArtwork::class.java, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          dreamWorld,
          officialArtwork,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Other?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("dream_world")
    nullableDreamWorldAdapter.toJson(writer, value_.dreamWorld)
    writer.name("official-artwork")
    nullableOfficialArtworkAdapter.toJson(writer, value_.officialArtwork)
    writer.endObject()
  }
}
