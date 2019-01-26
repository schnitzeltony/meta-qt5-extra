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

DEPENDS = "sf-tools-native"

inherit allarch

# TODO
# https://trisamples.com/free-soundfonts/
# https://sites.google.com/site/soundfonts4u/

SRC_URI = " \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/airfont_a340u.tar.7z;subdir=linuxaudio.org;name=airfont \
    http://download.linuxaudio.org/musical-instrument-libraries/sf2/fluidr3.tar.7z;subdir=linuxaudio.org;name=fluidr3 \
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
    \
    https://musical-artifacts.com/artifacts/248/iw_vint.zip;subdir=musical-artifacts;name=vintage-dreams-waves \
"

SRC_URI[airfont.md5sum] = "e1a0878510910b50786c9690ed7640b0"
SRC_URI[airfont.sha256sum] = "7c61d6243943e3ff86dbe776cf3f1cdb0af5e55ccda370491c02613849fd9df4"

SRC_URI[avl-drumkits.md5sum] = "f32ba8fe4e7ccb89c21fe3f6d915a15d"
SRC_URI[avl-drumkits.sha256sum] = "46a5d0d1fd3894082ae0ecdab3396a9a1b9eecc0076935f35980cdd7ce024382"

SRC_URI[fluidr3.md5sum] = "8657c8d9dfcb51aa0e3d045dd63cc053"
SRC_URI[fluidr3.sha256sum] = "a62235d86c920f141a1aa2a0921ceaee167478796d9e0ac1130fd87ec50a6a02"

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


SRC_URI[vintage-dreams-waves.md5sum] = "9d6151731c4edb91725bc4f530184f1a"
SRC_URI[vintage-dreams-waves.sha256sum] = "2706ec973acc390b888e0084c7afd4ba75da58f2772c13b1e398a6a66b021f15"


do_unpack[depends] += "p7zip-native:do_populate_sysroot"

S = "${WORKDIR}"

PACKAGES = " \
    ${PN}-meta \
    ${PN}-avl-drumkits \
    ${PN}-linuxaudio-org \
    ${PN}-linuxaudio-org-single \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
    ${PN}-philscomputerlab-com-single \
    ${PN}-christiancollins \
    ${PN}-musical-artifacts \
"

ALLOW_EMPTY_${PN}-meta = "1"
RRECOMMENDS_${PN}-meta = " \
    ${PN}-avl-drumkits \
    ${PN}-linuxaudio-org \
    ${PN}-linuxaudio-org-single \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
    ${PN}-philscomputerlab-com-single \
    ${PN}-christiancollins \
    ${PN}-musical-artifacts \
"

do_configure() {
}

do_install() {
    install -d ${D}${datadir}/sf2
    install ${WORKDIR}/freepats.zenvoid.org/*.sf2 ${D}${datadir}/sf2
    install ${WORKDIR}/www.philscomputerlab.com/*.sf2 ${D}${datadir}/sf2
    install "${WORKDIR}/GeneralUser GS 1.471/GeneralUser GS v1.471.sf2" ${D}${datadir}/sf2/general-user-gs-v1.471.sf2
    for soundfont in `find ${WORKDIR}/avl-drumkits -name '*.sf2'`; do
        install $soundfont ${D}${datadir}/sf2
    done

    for soundfont in `find ${WORKDIR}/linuxaudio.org -name '*.sf2'`; do
        echo "linuxaudio.org: $soundfont"
        install $soundfont ${D}${datadir}/sf2
    done

    # split some GM soundfonts into single files
    install -d ${D}${datadir}/sf2/fluidr3gm-single
    cd ${D}${datadir}/sf2/fluidr3gm-single
    sf2-split ${D}${datadir}/sf2/fluidr3gm.sf2
    
    install -d ${D}${datadir}/sf2/airfont_a320u-single
    cd ${D}${datadir}/sf2/airfont_a320u-single
    sf2-split ${D}${datadir}/sf2/airfont_a320u.sf2

    install -d ${D}${datadir}/sf2/weedsgm3
    cd ${D}${datadir}/sf2/weedsgm3
    sf2-split ${D}${datadir}/sf2/weedsgm3.sf2
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
"

FILES_${PN}-linuxaudio-org-single = " \
    ${datadir}/sf2/fluidr3gm-single \
    ${datadir}/sf2/airfont_a320u-single \
"

FILES_${PN}-freepats-zenvoid-org = " \
    ${datadir}/sf2/acoustic_grand_piano_ydp_20080910.sf2 \
    ${datadir}/sf2/acoustic_piano_imis_1.sf2 \
"

FILES_${PN}-philscomputerlab-com = " \
    ${datadir}/sf2/weedsgm3.sf2 \
    ${datadir}/sf2/choriumreva.sf2 \
"

FILES_${PN}-philscomputerlab-com-single = " \
    ${datadir}/sf2/weedsgm3 \
"

FILES_${PN}-christiancollins = "${datadir}/sf2/general-user-gs-v1.471.sf2"

FILES_${PN}-musical-artifacts = "${datadir}/sf2/Vintage-Dreams-Waves-V2.sf2"

