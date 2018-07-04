//
//  ViewController.swift
//  KotlinVideoEditor
//
//  Created by AJit on 7/5/18.
//

import UIKit
import SharediOS

class ViewController: UIViewController {

    @IBOutlet var textLabal: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        let platform = SOSSample().checkPlatform()
        textLabal.text = platform
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

