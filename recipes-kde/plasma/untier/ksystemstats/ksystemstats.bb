SUMMARY = "A plugin based system monitoring daemon"
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-only & GPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=534956ece1a160a65f088a8f82672ef9 \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
"

inherit kde-plasma

DEPENDS += " \
    kauth-native \
    kcoreaddons-native kcoreaddons \
    kconfig-native kconfig \
    kdbusaddons \
    ki18n \
    libksysguard \
    solid \
    kio \
    networkmanager-qt \
    lmsensors \
    libnl \
    udev \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "27fb535f4410b6232636ad3c2b671057cbefd0f785c77940146ba5958ff0adcf"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${systemd_user_unitdir} \
    ${OE_QMAKE_PATH_PLUGINS} \
"

