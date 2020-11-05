/*
 * Copyright 2015-2020 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Events indicating the {@link net.dv8tion.jda.api.entities.GuildVoiceState GuildVoiceState} updates
 * for one of the {@link net.dv8tion.jda.api.entities.Guild Guild}'s {@link net.dv8tion.jda.api.entities.Member Members}.
 * <br>Every update is an extensions of the {@link net.dv8tion.jda.api.events.guild.voice.GenericGuildVoiceEvent GenericGuildVoiceEvent}
 * and has specifications for explicit voice state features such as mute/deafen
 *
 * <h2>Requirements</h2>
 *
 * <p>These events require the {@link net.dv8tion.jda.api.utils.cache.CacheFlag#VOICE_STATE VOICE_STATE} CacheFlag to be enabled, which requires
 * the {@link net.dv8tion.jda.api.requests.GatewayIntent#GUILD_VOICE_STATES GUILD_VOICE_STATES} intent.
 *
 * <br>{@link net.dv8tion.jda.api.JDABuilder#createLight(String) createLight(String)} disables that CacheFlag by default!
 *
 * <p>Additionally, these events require the {@link net.dv8tion.jda.api.utils.MemberCachePolicy MemberCachePolicy}
 * to cache the updated members. Discord does not specifically tell us about the updates, but merely tells us the
 * member was updated and gives us the updated member object. In order to fire specific events like these we
 * need to have the old member cached to compare against.
 */
package net.dv8tion.jda.api.events.guild.voice;
