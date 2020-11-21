SUMMARY = "KDE Text encoding library"
LICENSE = "BSD-3-Clause & GPLv2.0+ & LGPLv2.0 & LGPLv2.0+ & LGPLv2.1+ & LGPLv3 & MIT & MPL-1.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MPL-1.1.txt;md5=bf952b9d390406a3cda9fb3fe9df72af \
"

inherit kde-kf5

DEPENDS += "gperf-native"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "b4e1fe3247fdaf80f4414716f6fbcd42e8de04f64c8dd50bd13e9e9a78abf6e1"

do_compile_append() {
    # gperf-native sets absolut debug comments/links in header
    sed -i 's:${STAGING_DIR_NATIVE}::' ${B}/src/kentities.h
}

