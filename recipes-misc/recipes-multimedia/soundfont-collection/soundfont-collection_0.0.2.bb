SUMMARY = "A collection of free soundfonts"
LICENSE = "GPLv2 & MIT & CC-BY-3.0"
LIC_FILES_CHKSUM = " \
    file://freepats.zenvoid.org/acoustic_grand_piano_ydp_20080910.txt;md5=6aca163c2105ed4ac00e4f3ce83c9e3a \
    file://freepats.zenvoid.org/acoustic_piano_imis_1.txt;md5=a9a3c1e67619043ca82d64dfca849288 \
    \
    file://GeneralUser%20GS%201.471/LICENSE.txt;md5=51c5827b75fa15c5e7f6f13290bc5445 \
    \
    file://avl-drumkits/AVL-Drumkits-1.1-fix-SF2/AVL-Drumkits%20CC-BY-SA%20License.pdf;md5=db54d5d5fcba6e9ca3f61185eec10a43 \
    \
    file://linuxaudio.org/airfont_a340u/readme;md5=94c7ebefcd275e72d018acec80b714cf \
    file://linuxaudio.org/fluidr3/readme;md5=4223817a5c95fe5efbe35d0e6b487063 \
    \
    file://freepats.zenvoid.org/acoustic_grand_piano_ydp_20080910.txt;md5=6aca163c2105ed4ac00e4f3ce83c9e3a \
    file://freepats.zenvoid.org/acoustic_piano_imis_1.txt;md5=a9a3c1e67619043ca82d64dfca849288 \
"

inherit allarch

# TODO
# https://trisamples.com/free-soundfonts/
# https://sites.google.com/site/soundfonts4u/

SRC_URI = " \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/airfont_a340u.tar.7z;subdir=linuxaudio.org;name=airfont \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3.tar.7z;subdir=linuxaudio.org;name=fluidr3 \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_bass.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-bass \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_brass.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-brass \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_chromaticpercussion.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-chromaticpercussion \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_drums.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-drums \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_ensemble.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-ensemble \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_ethnic.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-ethnic \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_guitar.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-guitar \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_organ.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-organ \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_percussive.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-percussive \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_pipe.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-pipe \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_piano.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-piano \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_reed.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-reed \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_soundeffects.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-soundeffects \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_strings.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-strings \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_syntheffects.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-syntheffects \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_synthlead.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-synthlead \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3-splitted/fluidr3gm_synthpad.sf2.tar.7z;subdir=linuxaudio.org;name=fluidr3gm-synthpad \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/jRhodes3.tar.7z;subdir=linuxaudio.org;name=jRhodes3 \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/melloflute.tar.7z;subdir=linuxaudio.org;name=melloflute \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/melloreed.tar.7z;subdir=linuxaudio.org;name=melloreed \
    \
    http://bandshed.net/sounds/sf2/AVL-Drumkits-1.1-fix-SF2.zip;subdir=avl-drumkits;name=avl-drumkits \
    \
    http://freepats.zenvoid.org/sf2/acoustic_grand_piano_ydp_20080910.txt;subdir=freepats.zenvoid.org;name=acoustic_grand_piano_ydp_license \
    http://freepats.zenvoid.org/sf2/acoustic_grand_piano_ydp_20080910.sf2;subdir=freepats.zenvoid.org;name=acoustic_grand_piano_ydp_sf2 \
    \
    http://freepats.zenvoid.org/sf2/acoustic_piano_imis_1.txt;subdir=freepats.zenvoid.org;name=acoustic_piano_imis_1_license \
    http://freepats.zenvoid.org/sf2/acoustic_piano_imis_1.sf2;subdir=freepats.zenvoid.org;name=acoustic_piano_imis_1_sf2 \
    \
    http://www.philscomputerlab.com/uploads/3/7/2/3/37231621/weedsgm3.sf2;subdir=www.philscomputerlab.com;name=weedsgm3 \
    http://www.philscomputerlab.com/uploads/3/7/2/3/37231621/choriumreva.sf2;subdir=www.philscomputerlab.com;name=choriumreva \
    \
    https://www.dropbox.com/s/4x27l49kxcwamp5/GeneralUser_GS_1.471.zip;name=christiancollins \
"

SRC_URI[airfont.md5sum] = "e1a0878510910b50786c9690ed7640b0"
SRC_URI[airfont.sha256sum] = "7c61d6243943e3ff86dbe776cf3f1cdb0af5e55ccda370491c02613849fd9df4"

SRC_URI[avl-drumkits.md5sum] = "f32ba8fe4e7ccb89c21fe3f6d915a15d"
SRC_URI[avl-drumkits.sha256sum] = "46a5d0d1fd3894082ae0ecdab3396a9a1b9eecc0076935f35980cdd7ce024382"

SRC_URI[fluidr3.md5sum] = "8657c8d9dfcb51aa0e3d045dd63cc053"
SRC_URI[fluidr3.sha256sum] = "a62235d86c920f141a1aa2a0921ceaee167478796d9e0ac1130fd87ec50a6a02"

SRC_URI[fluidr3gm-bass.md5sum] = "3e14a74a89ee1193b3711e15c7718032"
SRC_URI[fluidr3gm-bass.sha256sum] = "56619efac4550946d1fbe74bd059e358d5cef3fcc8257f6737b66e3e7bee11fe"

SRC_URI[fluidr3gm-brass.md5sum] = "dc6808a91c0f8e6dfe566f2e776c4910"
SRC_URI[fluidr3gm-brass.sha256sum] = "775295ae26f84cf6fb2069a176644bbc0038a42d5767fdd7ef218084091ef408"

SRC_URI[fluidr3gm-chromaticpercussion.md5sum] = "b74fcfd86cbfe61819a11dc8b64ec998"
SRC_URI[fluidr3gm-chromaticpercussion.sha256sum] = "c7850249adc7a667527129e3e1f7bae401d699df689f02b9ca2e526e06746388"

SRC_URI[fluidr3gm-drums.md5sum] = "768911e416da5de0abfbfc467a0d0f5a"
SRC_URI[fluidr3gm-drums.sha256sum] = "f961c6684880ae025912fcf4498ccdb0cb64d6e4f9329584efe85f51a41afb06"

SRC_URI[fluidr3gm-ensemble.md5sum] = "ffb5f6eea836d485cbeaecb45bf7fb75"
SRC_URI[fluidr3gm-ensemble.sha256sum] = "5d2d3be68780e8e0e191488b3cc81d1fc323aa67f141015be355b2abfe635c67"

SRC_URI[fluidr3gm-ethnic.md5sum] = "c73cb01cb192f22defb5b744b8b2dd57"
SRC_URI[fluidr3gm-ethnic.sha256sum] = "6105ddc8d85fd5b813250fb8135be3bc3cc8548eeece9542b2815363f9193f7c"

SRC_URI[fluidr3gm-guitar.md5sum] = "c4d49ff884eb729da01fc159fbf96412"
SRC_URI[fluidr3gm-guitar.sha256sum] = "31f46a5f2aaea7857780460dc4eba10aa698357b4f4f57b14ed0afa749efb2b4"

SRC_URI[fluidr3gm-organ.md5sum] = "e4fb2e4428183a64548281deb911290e"
SRC_URI[fluidr3gm-organ.sha256sum] = "d991c71083138f4f48995863bd4d77d1a3ca7e8b308511ecd350e4ca90c0f48b"

SRC_URI[fluidr3gm-percussive.md5sum] = "c8a4afdc45cfefd5409ad39d9d0ebdd0"
SRC_URI[fluidr3gm-percussive.sha256sum] = "c316f3fca1e955f9453414c7f22a940610d6e03c64ab0a52363681f9c30314bf"

SRC_URI[fluidr3gm-piano.md5sum] = "fcedef3aea615926ff8d2e5e8cdf0004"
SRC_URI[fluidr3gm-piano.sha256sum] = "593c0966d12624e76037f7023f7f5deca4dc965517ee90e945129fbefb094819"

SRC_URI[fluidr3gm-pipe.md5sum] = "abe06dfb215b0cf6ec1fab953c1ee416"
SRC_URI[fluidr3gm-pipe.sha256sum] = "c259df70894ef7a310e4bf897af9fd08fc5f4e252f9c779039c245b694de9f27"

SRC_URI[fluidr3gm-reed.md5sum] = "f5ce696f7bcd2cf2ed475c5cd9c7db06"
SRC_URI[fluidr3gm-reed.sha256sum] = "53497f0244ddd238125a6be7e80c7683c55093d1b63906cd53e7f36322e460f9"

SRC_URI[fluidr3gm-soundeffects.md5sum] = "b8c03ebb67f17a1a58f1e799d8013191"
SRC_URI[fluidr3gm-soundeffects.sha256sum] = "ddfd6b813fd69ce418b43458306823652e659d7e7b18652ff0af8c93147be869"

SRC_URI[fluidr3gm-strings.md5sum] = "ab7303ba5586300d28a4e8f774356c2c"
SRC_URI[fluidr3gm-strings.sha256sum] = "7a9d004b1045dc4e2dad0e05847f1beeb8cd0813c653ca6f8370dc1185c9ddda"

SRC_URI[fluidr3gm-syntheffects.md5sum] = "68b558da70ee9d4838156e2c1bc5f3ab"
SRC_URI[fluidr3gm-syntheffects.sha256sum] = "04ca477d361f7b6e01ca00bc1f3c5a414e873c29ead73e0b99929b9a362a9866"

SRC_URI[fluidr3gm-synthlead.md5sum] = "cddd58f8f09c2bfe38605d909a77e32c"
SRC_URI[fluidr3gm-synthlead.sha256sum] = "e510f95e8266924631cd1ed44eacd4eb3190ff95006381ec0bf023877d2bb12b"

SRC_URI[fluidr3gm-synthpad.md5sum] = "54ee8656af107dc24fcb0a262815f673"
SRC_URI[fluidr3gm-synthpad.sha256sum] = "b1297b4d8b28f3c4652b842bc19ebfe7ce72658b9423f3b3611e8155bd6997e0"

SRC_URI[jRhodes3.md5sum] = "1cf933decd312535fb8d8aa5772a39cf"
SRC_URI[jRhodes3.sha256sum] = "a50462992b19f4df65aa63d237bb0e45a071e63383ae9f2c5a2980d4ec3bcce1"

SRC_URI[melloflute.md5sum] = "6c0e273647acc80d770924fa661c7339"
SRC_URI[melloflute.sha256sum] = "d4fbbab82ee558092e9f6706c9bf865314cf5d848c7a1a076b039926d36cb305"

SRC_URI[melloreed.md5sum] = "f3f8ee58431c6482ec25d26ea63cc042"
SRC_URI[melloreed.sha256sum] = "b6f3ff4ccef5e1b4f35b81e915f85ae4fa0730bf01f26151c66ba04efb30d028"


SRC_URI[acoustic_grand_piano_ydp_license.md5sum] = "6aca163c2105ed4ac00e4f3ce83c9e3a"
SRC_URI[acoustic_grand_piano_ydp_license.sha256sum] = "4703a7b97685c7569884249032c99daee5a363eedcea1d63d19415ee83b51fed"

SRC_URI[acoustic_grand_piano_ydp_sf2.md5sum] = "d568b2bdee099db5d0647852428fd759"
SRC_URI[acoustic_grand_piano_ydp_sf2.sha256sum] = "8daab3c933edba50bdaec179c086a34285f21997ddfd40b142106f38c7050461"

SRC_URI[acoustic_piano_imis_1_license.md5sum] = "a9a3c1e67619043ca82d64dfca849288"
SRC_URI[acoustic_piano_imis_1_license.sha256sum] = "652358bcdb27582549c14348dfaafb1e296d9ec73c4a2a7354027705170556ab"

SRC_URI[acoustic_piano_imis_1_sf2.md5sum] = "34221eb4e67ea67c74395bc5877305ab"
SRC_URI[acoustic_piano_imis_1_sf2.sha256sum] = "b97fca4e191c8f1f4a97b443deba3cf925518fc0fffa7693c55af40405a6a183"


SRC_URI[weedsgm3.md5sum] = "924b76eec24353a3fd626a7afd34731e"
SRC_URI[weedsgm3.sha256sum] = "4de36fdec6a1f972d3b32ac35ff1c3178ceb0fc05ff5c9fb94aebde5197f8568"

SRC_URI[choriumreva.md5sum] = "3b3ccb921d9bf29992a174a3315ff723"
SRC_URI[choriumreva.sha256sum] = "993a1683a67f30c56c248290e1eb6c13b779331856e9a767ace0f5063f41f897"


SRC_URI[christiancollins.md5sum] = "5eaa95224f6080864cf6aedc1c9820a6"
SRC_URI[christiancollins.sha256sum] = "4203835164766f428c4926c097c9ea58dae431c7fb8f9dbe277b92d80da45ec2"

do_unpack[depends] += "p7zip-native:do_populate_sysroot"

S = "${WORKDIR}"

PACKAGES = " \
    ${PN}-meta \
    ${PN}-avl-drumkits \
    ${PN}-linuxaudio-org \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
    ${PN}-christiancollins \
"

ALLOW_EMPTY_${PN}-meta = "1"
RRECOMMENDS_${PN}-meta = " \
    ${PN}-avl-drumkits \
    ${PN}-linuxaudio-org \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
    ${PN}-christiancollins \
"

do_configure() {
}

do_install() {
    install -d ${D}${datadir}/sf2
    install ${WORKDIR}/freepats.zenvoid.org/*.sf2 ${D}${datadir}/sf2
    install ${WORKDIR}/www.philscomputerlab.com/*.sf2 ${D}${datadir}/sf2
    install "${WORKDIR}/GeneralUser GS 1.471/GeneralUser GS v1.471.sf2" ${D}${datadir}/sf2/general-user-gs-v1.471.sf2
    for soundfont in `find ${WORKDIR}/avl-drumkits -name *.sf2`; do
        install $soundfont ${D}${datadir}/sf2
    done
    for soundfont in `find ${WORKDIR}/linuxaudio.org -name *.sf2`; do
        install $soundfont ${D}${datadir}/sf2
    done
}

FILES_${PN}-avl-drumkits = " \
    ${datadir}/sf2/AVL_Drumkits_Perc_1.1.sf2 \
    ${datadir}/sf2/Black_Pearl*.sf2 \
    ${datadir}/sf2/Red_Zeppelin*.sf2 \
"

FILES_${PN}-linuxaudio-org = " \
    ${datadir}/sf2/fluidr3*.sf2 \
    ${datadir}/sf2/airfont_a320u.sf2 \
    ${datadir}/sf2/mello*.sf2 \
    ${datadir}/sf2/jRhodes3.sf2 \
P"

FILES_${PN}-freepats-zenvoid-org = " \
    ${datadir}/sf2/acoustic_grand_piano_ydp_20080910.sf2 \
    ${datadir}/sf2/acoustic_piano_imis_1.sf2 \
"

FILES_${PN}-philscomputerlab-com = " \
    ${datadir}/sf2/weedsgm3.sf2 \
    ${datadir}/sf2/choriumreva.sf2 \
"

FILES_${PN}-christiancollins = "${datadir}/sf2/general-user-gs-v1.471.sf2"
