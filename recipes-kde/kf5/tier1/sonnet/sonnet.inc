SUMMARY = "Support for spellchecking"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "a392739767e7f56cc3d951f0e55f1fa1d36a9f48e1b601b825212b50a1941193"
