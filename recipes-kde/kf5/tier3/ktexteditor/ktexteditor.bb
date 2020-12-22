SUMMARY = "Advanced embeddable text editor"
LICENSE = "BSD-2-Clause & LGPL-2.0 & LGPL-2.0+ & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    qtxmlpatterns \
    syntax-highlighting \
    karchive \
    kconfig \
    kconfig-native \
    kcoreaddons-native \
    kauth-native \
    kguiaddons \
    ki18n \
    kio \
    kparts \
    sonnet \
    sonnet-native \
    libgit2 \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "ccc5ea0c2bcbef3babbef727fc604361b1f7ddcf68829353846f315576e84033"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_PLUGINS} \
"
