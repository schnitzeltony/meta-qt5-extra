SUMMARY = "Barcode abstraction layer"
LICENSE = "BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[sha256sum] = "2252f6c4778bfbe85eba0cbe3b18f66e1c879b40ea73cf5db87f34c4d5e851dc"

PV = "${KF5_VERSION}"
