SUMMARY = "Libkdcraw is a C++ interface around LibRaw library"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
"

inherit kde-apps

DEPENDS += "\
    libraw \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "b1a11cdb53ac1a694bcdd8d2d4a7bb71d9fc16e84bd6e103c29f89ff0e6a3f0f"
