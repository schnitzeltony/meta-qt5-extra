SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPL-2.0-only & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native kconfig \
    kdoctools-native \
    kcoreaddons-native kcoreaddons \
    kcrash \
    kdbusaddons \
    kinit \
    kservice \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "4bdc348378f794aef9bc4f5dcae5a5d5a781a43bae64fdb9c8a04717e15ff6a7"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${libdir}/libkdeinit5_kded5.so \
    ${systemd_user_unitdir} \
"
FILES:${PN}-dev = "${libdir}/cmake"
