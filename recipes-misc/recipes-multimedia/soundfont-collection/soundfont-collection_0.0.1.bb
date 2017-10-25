SUMMARY = "A collection of free soundfonts"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = " \
    file://freepats.zenvoid.org/acoustic_grand_piano_ydp_20080910.txt;md5=6aca163c2105ed4ac00e4f3ce83c9e3a \
    file://freepats.zenvoid.org/acoustic_piano_imis_1.txt;md5=a9a3c1e67619043ca82d64dfca849288 \
"

inherit allarch

# TODO
# https://trisamples.com/free-soundfonts/
# https://sites.google.com/site/soundfonts4u/

SRC_URI = " \
    http://freepats.zenvoid.org/sf2/acoustic_grand_piano_ydp_20080910.txt;subdir=freepats.zenvoid.org;name=acoustic_grand_piano_ydp_license \
    http://freepats.zenvoid.org/sf2/acoustic_grand_piano_ydp_20080910.sf2;subdir=freepats.zenvoid.org;name=acoustic_grand_piano_ydp_sf2 \
    \
    http://freepats.zenvoid.org/sf2/acoustic_piano_imis_1.txt;subdir=freepats.zenvoid.org;name=acoustic_piano_imis_1_license \
    http://freepats.zenvoid.org/sf2/acoustic_piano_imis_1.sf2;subdir=freepats.zenvoid.org;name=acoustic_piano_imis_1_sf2 \
    \
    http://www.philscomputerlab.com/uploads/3/7/2/3/37231621/weedsgm3.sf2;subdir=www.philscomputerlab.com;name=weedsgm3_sf2 \
    http://www.philscomputerlab.com/uploads/3/7/2/3/37231621/choriumreva.sf2;subdir=www.philscomputerlab.com;name=choriumreva_sf2 \
"

SRC_URI[acoustic_grand_piano_ydp_license.md5sum] = "6aca163c2105ed4ac00e4f3ce83c9e3a"
SRC_URI[acoustic_grand_piano_ydp_license.sha256sum] = "4703a7b97685c7569884249032c99daee5a363eedcea1d63d19415ee83b51fed"

SRC_URI[acoustic_grand_piano_ydp_sf2.md5sum] = "d568b2bdee099db5d0647852428fd759"
SRC_URI[acoustic_grand_piano_ydp_sf2.sha256sum] = "8daab3c933edba50bdaec179c086a34285f21997ddfd40b142106f38c7050461"

SRC_URI[acoustic_piano_imis_1_license.md5sum] = "a9a3c1e67619043ca82d64dfca849288"
SRC_URI[acoustic_piano_imis_1_license.sha256sum] = "652358bcdb27582549c14348dfaafb1e296d9ec73c4a2a7354027705170556ab"

SRC_URI[acoustic_piano_imis_1_sf2.md5sum] = "34221eb4e67ea67c74395bc5877305ab"
SRC_URI[acoustic_piano_imis_1_sf2.sha256sum] = "b97fca4e191c8f1f4a97b443deba3cf925518fc0fffa7693c55af40405a6a183"

SRC_URI[weedsgm3_sf2.md5sum] = "924b76eec24353a3fd626a7afd34731e"
SRC_URI[weedsgm3_sf2.sha256sum] = "4de36fdec6a1f972d3b32ac35ff1c3178ceb0fc05ff5c9fb94aebde5197f8568"

SRC_URI[choriumreva_sf2.md5sum] = "3b3ccb921d9bf29992a174a3315ff723"
SRC_URI[choriumreva_sf2.sha256sum] = "993a1683a67f30c56c248290e1eb6c13b779331856e9a767ace0f5063f41f897"

S = "${WORKDIR}"

PACKAGES = " \
    ${PN}-meta \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
"

ALLOW_EMPTY_${PN}-meta = "1"
RRECOMMENDS_${PN}-meta = " \
    ${PN}-freepats-zenvoid-org \
    ${PN}-philscomputerlab-com \
"

do_install() {
    install -d ${D}${datadir}/sf2
    install ${WORKDIR}/freepats.zenvoid.org/*.sf2 ${D}${datadir}/sf2
    install ${WORKDIR}/www.philscomputerlab.com/*.sf2 ${D}${datadir}/sf2
}

FILES_${PN}-freepats-zenvoid-org = " \
    ${datadir}/sf2/acoustic_grand_piano_ydp_20080910.sf2 \
    ${datadir}/sf2/acoustic_piano_imis_1.sf2 \
"

FILES_${PN}-philscomputerlab-com = " \
    ${datadir}/sf2/weedsgm3.sf2 \
    ${datadir}/sf2/choriumreva.sf2 \
"
