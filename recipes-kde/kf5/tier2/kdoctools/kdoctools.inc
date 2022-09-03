SUMMARY = "Documentation generation from docbook"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 perlnative gettext

DEPENDS += " \
    liburi-perl-native \
    libxml2-native \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "61ac72b2d338cddc6da57b9097287303117e0d49ccd1c717f69f38ac01150af6"

EXTRA_OECMAKE += " \
    -DINSTALL_INTERNAL_TOOLS=ON \
"

