//
//  CustomizedPulltoRefreshViewController.m
//  CatalogCobalt
//
//  Created by Haploid on 29/07/14.
//  Copyright (c) 2014 Haploid. All rights reserved.
//

#import "CustomizedPulltoRefreshViewController.h"

@interface CustomizedPulltoRefreshViewController ()

@end

@implementation CustomizedPulltoRefreshViewController

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.refreshControl.tintColor = [UIColor redColor];
    
    NSMutableAttributedString *attString=[[NSMutableAttributedString alloc] initWithString:@"Tirer pour mettre à jour"];
    
    NSInteger _stringLength=[attString length];
    
    UIFont *font=[UIFont fontWithName:@"Helvetica-Bold" size:22.0f];
    [attString addAttribute:NSFontAttributeName value:font range:NSMakeRange(0, _stringLength)];
    [attString addAttribute:NSStrokeColorAttributeName value:[UIColor redColor] range:NSMakeRange(0, _stringLength)];
    [attString addAttribute:NSStrokeWidthAttributeName value:[NSNumber numberWithFloat:3.0] range:NSMakeRange(0, _stringLength)];
    
    NSMutableAttributedString *attRefreshString=[[NSMutableAttributedString alloc] initWithString:@"Chargement en cours"];
    
    _stringLength=[attRefreshString length];
    
    [attRefreshString addAttribute:NSFontAttributeName value:font range:NSMakeRange(0, _stringLength)];
    [attRefreshString addAttribute:NSStrokeColorAttributeName value:[UIColor redColor] range:NSMakeRange(0, _stringLength)];
    [attRefreshString addAttribute:NSStrokeWidthAttributeName value:[NSNumber numberWithFloat:3.0] range:NSMakeRange(0, _stringLength)];
    
    [self customizeRefreshControlWithAttributedRefreshText: attString  andAttributedRefreshText: attRefreshString andTintColor: [UIColor redColor]];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender
{
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
