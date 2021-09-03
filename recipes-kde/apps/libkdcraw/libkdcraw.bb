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
SRC_URI[sha256sum] = "95d7c72853e1529391c105b4d2c2ae2dc2a3aeb43f34db6a28a86628e9bb329e"
