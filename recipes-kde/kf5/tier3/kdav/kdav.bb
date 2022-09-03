SUMMARY = "DAV protocol implementation with KJobs"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
    kio \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "d58d8435eef1f57f0e7d207d63e002e29e0067e2621c522dfcba6f5df4fca5db"
